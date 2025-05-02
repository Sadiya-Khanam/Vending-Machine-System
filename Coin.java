public class Coin {
    public enum Denomination {
        ONE(1), FIVE(5), TEN(10), TWENTY(20);

        private final int value;

        Denomination(int value) {
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }

    private Denomination denomination;

    public Coin(Denomination denomination) {
        this.denomination=denomination;
    }

    public int getValue(){
        return denomination.getValue();
    }
    
}


