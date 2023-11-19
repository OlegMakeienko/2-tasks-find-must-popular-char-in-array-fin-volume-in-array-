public class Volume {
    private static int[] borders = {0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};

    public static void computeHistogramVolume () {
        int volume;
        int leftMaxBorder = borders[0];
        int rightMaxBorder = borders[borders.length - 1];
        int volume2 = 0;
        int volume1 = 0;

        int volumeBorders = 0;
        for (int i = 0; i < borders.length; i++) {
            volumeBorders += borders[i];
        }
        System.out.println(volumeBorders);

        int [] leftToRightWaterFill = new int[borders.length];
        for (int i = 0; i < borders.length; i++) {
            leftMaxBorder = Math.max(leftMaxBorder, borders[i]);
            leftToRightWaterFill[i] = leftMaxBorder;

        }
            for (int j = 0; j < leftToRightWaterFill.length; j++) {
                volume1 += leftToRightWaterFill[j];
            }
                System.out.println(volume1 - volumeBorders);

        int [] rightToRightWaterFill = new int[borders.length];
        for (int i = borders.length - 1; i >= 0; i--) {
            rightMaxBorder = Math.max(rightMaxBorder, borders[i]);
            rightToRightWaterFill[i] = rightMaxBorder;

        }
            for (int j = 0; j < rightToRightWaterFill.length; j++) {
                volume2 += rightToRightWaterFill[j];
            }
                System.out.println(volume2 - volumeBorders);


        volume = volume1 - volume2;

        System.out.println(volume);
    }

}
