public class Field {
    private Piece piece;
    public Field(){}
    public Field(Piece piece){
        this.piece=piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void removePiece(){
        this.piece=null;
    }

    public Piece getPiece() {
        return piece;
    }
    public String toString(){
        return ""+piece;
    }
}
