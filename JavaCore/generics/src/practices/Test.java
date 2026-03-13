package practices;


class Test<T,U,R> {
	
	T obj1;
	U obj2;
	R obj3;
	
	public Test(T obj1, U obj2, R obj3) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}

	@Override
	public String toString() {
		return "Test [obj1=" + obj1 + ", obj2=" + obj2 + ", obj3=" + obj3 + "]";
	}
	
	
}
