public class Volume {
    private static int[] borders = {0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0};

    public static void computeHistogramVolume () {
        int volume = 0;
        int leftMaxBorder = borders[0];
        int rightMaxBorder = borders[borders.length - 1];

        int [] leftToRightWaterFill = new int[borders.length];
        for (int i = 0; i < borders.length; i++) {
            leftMaxBorder = Math.max(leftMaxBorder, borders[i]);
            leftToRightWaterFill[i] = leftMaxBorder;
        }



        int [] rightToRightWaterFill = new int[borders.length];
        for (int i = borders.length - 1; i >= 0; i--) {
            rightMaxBorder = Math.max(rightMaxBorder, borders[i]);
            rightToRightWaterFill[i] = rightMaxBorder;
        }

        for (int i = 0; i < borders.length; i++) {
            int min = Math.min(rightToRightWaterFill[i], leftToRightWaterFill[i]);
            volume += (min - borders[i]);
        }

        System.out.println(volume);
    }

    private void nonFunction() {

    }
}
