package askhsh2;

public class MyUtils {

    public static int AnazhthshMeEponymo(Foititis[] pin, String key) {
        System.out.println("Ginete Anazitisi me Eponymo...");
        int size = pin.length;

        for (int i = 0; i < size; i++) {
            if (pin[i].getEponymo().equals(key)) {
                return i;
            }
        }
        return -1;
    }


    public static void insertSortAM(Foititis[] pin) {

        for (int i = 1; i < pin.length; i++) {
            Foititis current = pin[i];
            int j = i;

// metakinisi megalyteron timon dexia
            while (j > 0 && pin[j - 1].getAm() > current.getAm()) {
                pin[j] = pin[j - 1];
                j--;
            }
            pin[j] = current;
        }
    }

    public static void selectSortEponymo(Foititis[] pin) {
        int pos;
        Foititis temp;
        for (int i = 0; i < pin.length - 1; i++) {
// thesi tis min timis
            pos = i;
            for (int k = i + 1; k < pin.length; k++)
                if (pin[k].getEponymo().compareTo(pin[pos].getEponymo()) < 0) pos = k;
//swap tis times “pos" kai "i"
            temp = pin[pos];
            pin[pos] = pin[i];
            pin[i] = temp;
        }
    }

    public static void bubbleSortEE(Foititis[] A) {
        int i, j;
        Foititis temp;
        boolean flag;
        for (i = 1; i < A.length; i++) {
            flag = true;
            for (j = 0; j < A.length - i; j++)
                if (A[j].getEtos() > A[j + 1].getEtos()) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    flag = false;
                }
            if (flag) return;
        }
    }

    public static int anazitisiMeEE(Foititis[] pin, int Key) {

        int left = 0, right = pin.length - 1;
        int mid, found = -1;
        while (found == -1 && left <= right) {
            mid = (left + right) / 2;
            if (Key < pin[mid].getEtos()) { // to x sto 1o miso
                right = mid - 1;
            } else if (Key > pin[mid].getEtos()) { // to x sto 2o miso
                left = mid + 1;
            } else found = mid;
        }
        return found;
    }


    // Binary Search
    public static int anazitisiMeArMitrwou(Foititis[] pin, int Key) {

        int left = 0, right = pin.length - 1;
        int mid, found = -1;
        while (found == -1 && left <= right) {
            mid = (left + right) / 2;
            if (Key < pin[mid].getAm()) { // to x sto 1o miso
                right = mid - 1;
            } else if (Key > pin[mid].getAm()) { // to x sto 2o miso
                left = mid + 1;
            } else found = mid;
        }
        return found;
    }


    //Recursive Binary search
    public static int anadromiAnazMeArithMitrwou(Foititis[] arr, int key, int left, int right) {
        int mid;
        if (right < left) {
            return -1;
        }
        mid = (left + right) / 2;
        if (arr[mid].getAm() < key)
            return anadromiAnazMeArithMitrwou(arr, key, mid + 1, right);
        else if (arr[mid].getAm() > key)
            return anadromiAnazMeArithMitrwou(arr, key, left, mid - 1);
        else return mid;


    }


}

