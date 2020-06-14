public class Tile {

    private static final int ID = 0 ;
    public String Symbol;
    private Object player;

    public Tile(int i1, int i) {
    }


    public void setTile(Player currentPlayer) {
        switch (ID) {
                case 0:
                    calculateCash();
                    break;
                case 1:
                    invest();
                    break;
                case 2:
                    steal();
                    break;
                case 3:
                    activateChance();
                    break;
                case 4:
                    startParty();
                    break;
                case 5:
                    activate();
                    break;
            }
    }

    private void activate() {
    }

    private void startParty() {

    }

    private void activateChance() {
    }

    private void steal() {
    }

    private void invest() {
    }

    private void calculateCash() {
    }

    public Object Name() {
        return null;
    }

    public Object getSymbol() {

        return null;
    }

    public Object getName() {

        return null;
    }

    public Object getInitSymbol() {

        return null;
    }

}
