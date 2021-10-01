package lesson9_exception;

public class DemoMultiException {
    public static void main(String[] args) {
        String[] arr = { "1", "2", "abc", "3", null, "4" };
        //                0    1    2     3     4     5     6
        
        // 1 try -> nhiều catch -> 1 finally
        for (int i = 0; i < 7; i++) {
            try {
                int tmp = Integer.parseInt(arr[i]);
                System.out.println(tmp);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Kết thúc xử lý");
            } catch (Exception e) {
                xuatThongTinLoi(e);
            } finally {
                System.out.println("Xử lý thành công");
            }
        }
        
    }

    private static void xuatThongTinLoi(Exception e) {
        System.out.println("-------------------");
        System.out.println("Lỗi:");
        e.printStackTrace();
        System.out.println("-------------------");
//        throw new UnsupportedOperationException("Not supported yet.");
    }
}
