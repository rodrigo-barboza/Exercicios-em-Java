package externa;

@interface Informacao {
    String autor();
    int aulaNumero();
    String blog() default "http://google.com";
    String site() default "www.google.com";
}
