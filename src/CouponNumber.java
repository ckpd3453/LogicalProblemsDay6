public class CouponNumber {
	
	public static void main(String[] args)
	{
		// array and random varible to make array coupon code
				char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
				int max = 100000000;
				int random = (int) (Math.random() * max);
				StringBuffer sb = new StringBuffer();

				// logic
				while (random > 0) {
					sb.append(chars[random % chars.length]);
					random /= chars.length;
				}

				// print
				String couponCode = sb.toString();
				System.out.println("Coupon Code: " + couponCode);
	}

}
