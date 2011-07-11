/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010 - 2011 and Ownership of code is shared by:
 * Qmino bvba - Romeinsestraat 18 - 3001 Heverlee  (http://www.qmino.com)
 * Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.graph;

import java.util.Iterator;

/**
 * No comment provided yet for this class.
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 11/07/11<br>
 * <i>Creation-Time</i>:  11:35<br>
 * </p>
 *
 * @param <N> The type that represents the nodes.
 * @author Bert Vanhooff
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 * @since SDK1.5
 */
public interface Graph<N> extends Iterable<InternalNode<N>> {
    Iterator<InternalNode<N>> iterator();

    InternalNode<N> getInternalNode(N node);

    /**
     * Gets the edges that start from the given internalNode, depending on the given modus.
     *
     * @param internalNode           The internalNode.
     * @param contextualReachability An object to determine whether an edge can be used.
     * @return A internalNode iterator for the outgoing nodes.
     */
    Iterator<InternalNode<N>> getOutGoingEdges(InternalNode<N> internalNode, ContextualReachability contextualReachability);
}
