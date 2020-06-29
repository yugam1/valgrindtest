#include <stdlib.h>

int main()
{
    char *x = malloc(10);
    x[10] = 'a';
    printf("Code Ran Successfully\n");
    return 0;
}
