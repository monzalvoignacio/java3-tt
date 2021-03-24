public class SortUtils {
    public static <T> void ordenar(Precedable<T> arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j].precedeA((T)arr[j-1]) < 0) {
                    Precedable temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
