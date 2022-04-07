public class PaintJob {

    public static void main(String[] args) {

        System.out.println("Method 1");

        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(0.0,2.1,1.5,7));



        System.out.println("Method 2");

        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        System.out.println("Method 3");

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println(getBucketCount(-3.4, 1.5));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){

        if(width > 0.0 && height > 0.0 && areaPerBucket > 0.0){

           int bucketount = getBucketCount(width, height, areaPerBucket);
            //System.out.println(bucketount);

            if(extraBucket >= 0){
                return bucketount - extraBucket;
            }

        }

        return -1;
    }

    public static int getBucketCount(double width, double height, double arePerBucket){

        if( width > 0.0 && height > 0.0 && arePerBucket > 0.0){

            double area = width * height;
            double bucketCount = area / arePerBucket;
            return (int) Math.ceil(bucketCount);

        }
        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area > 0.0 && areaPerBucket > 0.0){
            double numberOfBucket = area / areaPerBucket;

            return (int)Math.ceil(numberOfBucket);

        }
        return -1;
    }
}
