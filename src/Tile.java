public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();

    // Empty tile is a tile with no Piece on it
    public static final class EmptyTile extends Tile{
        EmptyTile(int coordinate) {
            super(coordinate);
        }
        @Override
        public boolean isTileOccupied(){return false;}

        @Override
        public Piece getPiece() {
            return null;
        }

    }

    // Occupied Tile has exactly one Piece on it
    public static final class OccupiedTile extends Tile {
        Piece pieceOnTile;
        OccupiedTile(int coordinate, Piece pieceOnTile) {
            super(coordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }



}

