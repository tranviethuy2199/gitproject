package LuyenTap.Text;

public class Text {
    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == -1) {
                continue;
            }for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == -1) {
                        continue;
                    }else if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }

                }
            }
        }
    }

