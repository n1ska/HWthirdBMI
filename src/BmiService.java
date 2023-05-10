public class BmiService {
    public int calculate (int massKg, double heightM) {

        return (int) (massKg/(heightM * heightM));
    }

}
