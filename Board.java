import com.sun.org.apache.xerces.internal.xs.XSTypeDefinition;

public class Board {
    private Cell[][] cell;

    public Board() {
        cell = new Cell[3][3];
        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j++) {
                cell[i][j] = new Cell();
            }
        }
    }

    public boolean update(int x, int y, CellStatus status) {
        if(x < 0 || x > 2 || y < 0 || y > 2 || cell[x][y].getCs() != CellStatus.EMPTY)return false;
        cell[x][y].setCs(status);
        return true;
    }

    public void print() {
        for(int i = 0; i < 3; i ++) {
            for(int j = 0; j < 3; j++) {
                cell[i][j].print();
            }
            System.out.println("");
        }
    }

    public boolean isWin() {
        for(int i = 0; i < 3; i++) {
            if(cell[i][0].getCs() == cell[i][1].getCs() && cell[i][1].getCs() == cell[i][2].getCs() && cell[i][0].getCs() != CellStatus.EMPTY) return true;
            if(cell[0][i].getCs() == cell[1][i].getCs() && cell[1][i].getCs() == cell[2][i].getCs() && cell[0][i].getCs() != CellStatus.EMPTY)return true;
        }
        if(cell[0][0].getCs() == cell[1][1].getCs() && cell[1][1].getCs() == cell[2][2].getCs() && cell[0][0].getCs() != CellStatus.EMPTY)return true;
        if(cell[2][0].getCs() == cell[1][1].getCs() && cell[1][1].getCs() == cell[0][2].getCs() && cell[1][1].getCs() != CellStatus.EMPTY)return true;
        return false;
    }
}
