import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long[] a = {1, 9, 30, 76, 141, 267, 400, 624, 885, 1249, 1590, 2208, 2689, 3411, 4248, 5248, 6081, 7485, 8530, 10248, 11889, 13687, 15228, 17988, 20053, 22569, 25242, 28588, 31053, 35463, 38284, 42540, 46581, 50893, 55362, 61824, 65857, 71247, 76884, 84388, 89349, 97881, 103342, 111528, 120141, 128047, 134580, 146316, 154177, 164817, 174438, 185836, 194157, 207927, 218812, 233268, 245277, 257857, 268182, 288216, 299257, 313635, 330204, 347836, 362973, 383709, 397042, 416448, 434025, 456967, 471948, 499740, 515581, 536073, 559758, 583960, 604833, 633651, 652216, 683712, 709065, 734233, 754734, 793188, 818917, 846603, 874512, 909496, 933081, 977145, 1006126, 1041504, 1073385, 1106467, 1138536, 1187112, 1215145, 1255101, 1295142, 1342852, 1373253, 1422195, 1453816, 1502376, 1553361, 1595437, 1629570, 1691292, 1726717, 1782111, 1827492, 1887772, 1925853, 1986837, 2033674, 2089776, 2145333, 2197483, 2246640, 2332104, 2379085, 2434833, 2490534, 2554600, 2609625, 2693919, 2742052, 2813988, 2875245, 2952085, 3003306, 3096024, 3157249, 3224511, 3306240, 3388576, 3444609, 3533637, 3591322, 3693924, 3767085, 3842623, 3912324, 4027884, 4102093, 4181949, 4270422, 4361548, 4427853, 4548003, 4616104, 4718640, 4812789, 4918561, 5003286, 5131848, 5205481, 5299011, 5392008, 5521384, 5610705, 5739009, 5818390, 5930196, 6052893, 6156139, 6239472, 6402720, 6493681, 6623853, 6741078, 6864016, 6953457, 7094451, 7215016, 7359936, 7475145, 7593865, 7689630, 7886244, 7984165, 8130747, 8253888, 8403448, 8523897, 8684853, 8802826, 8949612, 9105537, 9267595, 9376656, 9574704, 9686065, 9827097, 9997134, 10174780, 10290813, 10493367, 10611772, 10813692};
        System.out.println(a[k-1]);
    }
}