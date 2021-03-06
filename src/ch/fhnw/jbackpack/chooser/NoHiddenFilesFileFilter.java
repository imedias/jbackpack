/**
 * Copyright (C) 2010 imedias
 *
 * This file is part of JBackpack.
 *
 * JBackpack is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * JBackpack is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package ch.fhnw.jbackpack.chooser;

import java.io.File;
import java.io.FileFilter;

/**
 * a FileFilter that does not accept hidden files
 *
 * @author Ronny Standtke <ronny.standtke@fhnw.ch>
 */
public class NoHiddenFilesFileFilter implements FileFilter {

    private final static NoHiddenFilesFileFilter INSTANCE =
            new NoHiddenFilesFileFilter();

    private NoHiddenFilesFileFilter() {
    }

    /**
     * returns an instance of NoHiddenFilesFileFilter
     *
     * @return an instance of NoHiddenFilesFileFilter
     */
    public static NoHiddenFilesFileFilter getInstance() {
        return INSTANCE;
    }

    public boolean accept(File file) {
        return !file.isHidden();
    }
}
