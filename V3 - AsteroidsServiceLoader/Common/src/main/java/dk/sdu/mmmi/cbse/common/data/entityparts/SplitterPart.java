/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.common.data.entityparts;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

/**
 *
 * @author Phillip O
 */
public class SplitterPart implements EntityPart {

    private boolean shouldSplit = false;
    
    public SplitterPart() {
        
    }
    
    public boolean getShouldSplit() {
        return shouldSplit;
    }

    public void setShouldSplit(boolean shouldSplit) {
        this.shouldSplit = shouldSplit;
    }
    
    @Override
    public void process(GameData gameData, Entity entity) {
        
    }
}
