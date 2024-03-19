import java.util.Random;
import java.util.Arrays;

public class Queue {
    private listThatGOESbigANDSMAllAllALone WAAAAAA;
    private Queue WHAITisTHsiWHELllo = null;

    public void print() {
        WAAAAAA.print();
        if (WHAITisTHsiWHELllo != null)
            WHAITisTHsiWHELllo.print();
    }

    Random casualStuFF = new Random();
    public int FlipACoin() {
        return casualStuFF.nextInt(2);
    }

    Queue() {
        this.WAAAAAA = new listThatGOESbigANDSMAllAllALone();
    }

    public boolean isEmpty() {
        return WAAAAAA.ppsize() == 0;
    }

    public void addWAA(int elEMForWAAA) {
        this.WAAAAAA.puiTNEWELEMNENT(elEMForWAAA);
    }
    public void endAtTheAddd(int LitteralLLYTOADDtoWAAAAAA){
        if (WHAITisTHsiWHELllo != null) {
            WHAITisTHsiWHELllo.endAtTheAddd(LitteralLLYTOADDtoWAAAAAA);
        }
        else
            addWAA(LitteralLLYTOADDtoWAAAAAA);
    }

    public void insert(int LitteralLLYTOADDtoWAAAAAA) {

        // go to bottom of queue if arr is not empty
        if (!this.isEmpty() && WHAITisTHsiWHELllo != null) {
            WHAITisTHsiWHELllo.insert(LitteralLLYTOADDtoWAAAAAA);
        }
        else {
            if (this.isEmpty() || FlipACoin() == 0) {
                // add to array
                WAAAAAA.puiTNEWELEMNENT(LitteralLLYTOADDtoWAAAAAA);
            }
            else {
                // create new node and add here
                WHAITisTHsiWHELllo = new Queue();
                WHAITisTHsiWHELllo.endAtTheAddd(LitteralLLYTOADDtoWAAAAAA);
            }
        }
    }

    // get first elem
    public int extract() throws EmptyQueueException {
        if (this.isEmpty()) throw new EmptyQueueException();

        // NOTE: REMOVED optimized by two seconds
        // Thread.sleep(2000);

        int theThinmsTHATbYEYBYE = this.WAAAAAA.KilllTEFIRSTyousee();

        if (this.isEmpty()) {
            if (this.WHAITisTHsiWHELllo != null) {
                this.WAAAAAA = WHAITisTHsiWHELllo.WAAAAAA;
                this.WHAITisTHsiWHELllo = WHAITisTHsiWHELllo.WHAITisTHsiWHELllo;
            };

        }

        return theThinmsTHATbYEYBYE;
    }

    public listThatGOESbigANDSMAllAllALone kILLtheFIRSTyousee() {
        listThatGOESbigANDSMAllAllALone deaADinnit = WAAAAAA;

        WAAAAAA = WHAITisTHsiWHELllo.WAAAAAA;
        WHAITisTHsiWHELllo = WHAITisTHsiWHELllo.WHAITisTHsiWHELllo;

        return deaADinnit;
    }

    public void AddBLOCK(Queue newfren) {
        if (WHAITisTHsiWHELllo != null) WHAITisTHsiWHELllo.AddBLOCK(newfren);
        else WHAITisTHsiWHELllo = newfren;
    } 

    public void revolution() {
        if (WHAITisTHsiWHELllo == null) {
            WAAAAAA.throwITBACK();
            return;
        };

        WAAAAAA.throwITBACK();

        listThatGOESbigANDSMAllAllALone aNOTHERLIST= this.kILLtheFIRSTyousee();
        this.revolution();

        Queue THENEWME = new Queue();
        THENEWME.WAAAAAA = aNOTHERLIST;
        this.AddBLOCK(THENEWME);

    }

    public class listThatGOESbigANDSMAllAllALone {
        private int[] arr = {};

        public int ppsize() {
            return arr.length;
        }


        public void puiTNEWELEMNENT(int value) {

            // extend size
            int newArr[] = new int[arr.length + 1]; // create array big enough to store a new value
            System.arraycopy(arr, 0, newArr, 0, arr.length);

            newArr[newArr.length - 1] = value;

            arr = newArr;
        }

        // checked if emnpty before
        public int KilllTEFIRSTyousee() {
            int toRemove = arr[0];

            int newArr[] = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArr, 0, newArr.length);

            arr = newArr;

            return toRemove;

        }

        public void throwITBACK() {
            // reverse array by swapping values
            int temp;
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }

        }


        public void print() {
            System.out.println("arr: " + Arrays.toString(arr));
        }
    }
}

