package com.crypticvortex.minesweeper.mechanics;

/**
 * Individual tile data.
 *
 * @author Jatboy
 * @author Caraibe8
 */
public class Tile {
    private boolean isMine;
    private boolean isDiscovered;
    private FlagType flagType; //INVALID if no flag is present.

    /**
     * Create a new tile identical to the given one.
     * @param tile Type to copy
     */
    public Tile(Tile tile){
        this(tile.isMine(), tile.getFlagType());
        isDiscovered = tile.isShown();
    }

    /**
     * Create a new tile
     * @param isMine if the tile should be considered as a mine
     */
    public Tile(boolean isMine) {
        this.isMine = isMine;
        this.isDiscovered = false;
        flagType = FlagType.INVALID;
    }

    /**
     * Create a new tile with the given flag.
     * @param isMine if the tile should be considered as a mine
     * @param type what flag should the tile have
     */
    public Tile(boolean isMine, FlagType type) {
        this(isMine);
        this.flagType = type;
    }

    public boolean isMine() {
        return isMine;
    }

    public boolean isShown() {
        return isDiscovered;
    }

    /**
     * Set the tile to have a flag of specified color.
     * @param flagType Color of the flag to place.
     * @return If the value is set.
     */
    public boolean setFlagType(FlagType flagType) {
        if(!isDiscovered) {
            this.flagType = flagType;
            return true;
        }
        return false;
    }

    public FlagType getFlagType() {
        return flagType;
    }

    /**
     * Set the tile as shown if it does not have a flag.
     * @return true if the tile is a mine
     */
    public boolean show(){
        if(flagType == FlagType.INVALID)
            return false;
        isDiscovered = true;
        return isMine;
    }
}