function indirectWhile(foo,bar){
    if (foo()) {
        bar();
        indirectWhile(foo,bar);
    }
}
