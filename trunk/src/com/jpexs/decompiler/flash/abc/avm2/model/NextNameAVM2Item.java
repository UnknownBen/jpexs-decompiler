/*
 *  Copyright (C) 2010-2013 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.abc.avm2.model;

import com.jpexs.decompiler.flash.abc.avm2.ConstantPool;
import com.jpexs.decompiler.flash.abc.avm2.instructions.AVM2Instruction;
import com.jpexs.decompiler.flash.helpers.HilightedTextWriter;
import com.jpexs.decompiler.graph.GraphTargetItem;
import com.jpexs.decompiler.graph.model.LocalData;
import com.jpexs.helpers.Helper;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author JPEXS
 */
public class NextNameAVM2Item extends AVM2Item {

    GraphTargetItem index;
    GraphTargetItem obj;

    public NextNameAVM2Item(AVM2Instruction instruction, GraphTargetItem index, GraphTargetItem obj) {
        super(instruction, NOPRECEDENCE);
        this.index = index;
        this.obj = obj;
    }

    @Override
    public HilightedTextWriter toString(HilightedTextWriter writer, LocalData localData) {
        hilight("nextName(", writer);
        index.toString(writer, localData);
        hilight(",", writer);
        obj.toString(writer, localData);
        return hilight(")", writer);
    }
}
