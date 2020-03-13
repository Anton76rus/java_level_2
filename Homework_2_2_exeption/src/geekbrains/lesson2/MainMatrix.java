package geekbrains.lesson2;


public class MainMatrix {

    static String strValue = "10 3 1 2\\n2 3 2 2\\n5 6 7 1\\n300 3 1 0";
    static String[][] matrix;

    public static void main(String[] args) {
        try {
            toMatrix();
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
           throw new RuntimeException(e);
        }
        System.out.println(division(getSumNumberFromString(),2));
    }

    static void toMatrix() {
        int x = 0;
        int y = 0;
        matrix = new String[getX()][getY()];
        for (int i = 0;i < strValue.length();i++) {
            if (strValue.charAt(i) == '\\') continue;
            if (strValue.charAt(i) == 'n' ) {
                x++;
                y = 0;
                continue;
            }
            if (strValue.charAt(i) == ' '){
                y++;
                continue;
            }
            if (strValue.charAt(i) > '9' | strValue.charAt(i) < '0'){
                throw new NumberFormatException("In the array symbol \"" + strValue.charAt(i) + "\" is not number");
            }
            if (matrix[x][y] != null) {
                matrix[x][y] += strValue.charAt(i);
            }else {
                matrix[x][y] = String.valueOf(strValue.charAt(i));
            }
        }
    }

    static int getX(){
        int x = 1;
        for (int i = 0;i < strValue.length();i++){
            if (strValue.charAt(i) == '\\'){
                x++;
                System.out.println();
            }
        }
        if (x > 4 | x < 4){
            throw new ArrayIndexOutOfBoundsException("Array border x not equals 4");
        }
        return x;
    }

    static int getY() throws ArrayIndexOutOfBoundsException{
        int y = 1;
        for (int i = 0; i < strValue.length();i++){
            if(strValue.charAt(i) == ' '){
                y++;
            }
            if(strValue.charAt(i) == '\\' ){
                y = 1;
            }
        }
        if (y > 4 | y < 4){
            throw new ArrayIndexOutOfBoundsException("Array border y equals 4");
        }
        return y;
    }

    static int getSumNumberFromString(){
        int sum = 0;
        for (int x = 0;x < matrix.length;x++){
            for (int y = 0;y <matrix.length;y++){
                sum += Integer.parseInt(matrix[x][y]);
            }
        }
        return sum;
    }

    static int division(int divided,int divider){
        return divided / divider;
    }

}
