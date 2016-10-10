package gw2api.api.items;

import gw2api.api.items.details.ArmorDetails;
import gw2api.api.items.details.BackDetails;
import gw2api.api.items.details.ConsumeableDetails;
import gw2api.api.items.details.ContainerDetails;
import gw2api.api.items.details.GatheringToolsDetails;
import gw2api.api.items.details.GizmoDetails;
import gw2api.api.items.details.SalvageKitDetails;
import gw2api.api.items.details.TrinketDetails;
import gw2api.api.items.details.UpgradeComponentDetails;
import gw2api.api.items.details.WeaponDetails;

public enum ItemType {
    ARMOR(ArmorDetails.class), BACK(BackDetails.class), BAG(BackDetails.class), 
    CONSUMABLE(ConsumeableDetails.class), CONTAINER(ContainerDetails.class),
    CRAFTING_MATERIAL, GATHERING(GatheringToolsDetails.class),
    GIZMO(GizmoDetails.class), MINI_PET, TOOL(SalvageKitDetails.class),
    TRAIT, TRINKET(TrinketDetails.class), TROPHY,
    UPGRADE_COMPONENT(UpgradeComponentDetails.class),
    WEAPON(WeaponDetails.class);
    
    private final Class<? extends Details> detailsClass;

    private ItemType() {
        this(null);
    }
    
    private ItemType(Class<? extends Details> detailsClass) {
        this.detailsClass = detailsClass;
    }

    public Class<? extends Details> getDetailsClass() {
        return detailsClass;
    }
}
