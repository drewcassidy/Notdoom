/*
 * Created 16-05-11 by 16cassidyandrew
 * Copyright (C) 2016
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package NotDoom.Map;

/**
 *
 * @author 16cassidyandrew
 */

// convex area in a NotDoom map
public class Region {
    
    // FIELDS

    private Vector[] vertexes; //typo preserved for Doom authenticity
    private WallData[] wallData;
    private int floor;
    private int ceiling;


    // CONSTRUCTORS

    public Region(Vector[] vertexes, int floor, int ceiling) {
        this.vertexes = vertexes;
        this.floor = floor;
        this.ceiling = ceiling;
    }


    // METHODS

}
