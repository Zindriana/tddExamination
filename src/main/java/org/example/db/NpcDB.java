package org.example.db;

import org.example.models.NPC;

public class NpcDB {
    NPC[] npcsDB = new NPC[4];

    public NpcDB() {

        npcsDB[0] = new NPC("Hooded figure");
    }

    public NPC getNPC(String npcName) {
        for(NPC npc : npcsDB){
            if(npc != null && npc.getName().equals(npcName))
                return npc;
        }
        return null;
    }

}
