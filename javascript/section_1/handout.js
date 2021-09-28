function indirectWhile(fun1, fun2) {
    if(fun1()){
	fun2();
	indirectWhile(fun1, fun2);
    }
}
