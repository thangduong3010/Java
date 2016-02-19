package random_stuff;

class Sum {
	static int sum(int ... n) {
		int sum = 0;
		for(int i = 0; i < n.length; i++)
			sum += n[i];
		return sum;
	}
}

class Chap6_Ex13 {
	public static void main(String[] args) {
		System.out.println(Sum.sum(1, 2, 3, 4, 5));
	}
}
