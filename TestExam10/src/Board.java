import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private Field[][] fields;

    public Board(int row,int col){
        this.fields=new Field[row][col];
    }
    public void setPiece(int row,int col,Piece piece) {
        fields[row][col].setPiece(piece);
    }
    public void removePiece(int row,int col){

        fields[row][col].removePiece();
    }
    public void movePiece(int fromRow,int fromCol,int toRow,int toCol){
        fields[fromRow][fromCol]=fields[toRow][toCol];
        fields[fromRow][fromCol].removePiece();
    }
    public Piece show(int row,int col){
        return fields[row][col].getPiece();
    }
    public boolean isEmpty(int row,int col){
        return fields[row][col].getPiece()==null;
    }
    public String toString(){
        return Arrays.toString(fields);
    }
}
