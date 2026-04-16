//c project
#include <stdio.h>

// Colors
#define RED   "\033[1;31m"
#define GREEN "\033[1;32m"
#define BLUE  "\033[1;34m"
#define YELLOW "\033[1;33m"
#define RESET "\033[0m"

#define PI 3.14

// Triangle
void triangle() {
    float base, height;
    float *b = &base, *h = &height;

    printf("\nEnter base: ");
    scanf("%f", b);
    printf("Enter height: ");
    scanf("%f", h);

    float area = 0.5 * (*b) * (*h);
    printf(GREEN "Area of Triangle = %.2f\n" RESET, area);
}

// Square
void square() {
    float side;
    float *s = &side;

    printf("\nEnter side: ");
    scanf("%f", s);

    printf(GREEN "Area = %.2f\n" RESET, (*s) * (*s));
    printf(BLUE "Perimeter = %.2f\n" RESET, 4 * (*s));
}

// Rectangle
void rectangle() {
    float l, w;
    float *pl = &l, *pw = &w;

    printf("\nEnter length: ");
    scanf("%f", pl);
    printf("Enter width: ");
    scanf("%f", pw);

    printf(GREEN "Area = %.2f\n" RESET, (*pl) * (*pw));
    printf(BLUE "Perimeter = %.2f\n" RESET, 2 * ((*pl) + (*pw)));
}

// Circle
void circle() {
    float r;
    float *pr = &r;

    printf("\nEnter radius: ");
    scanf("%f", pr);

    printf(GREEN "Area = %.2f\n" RESET, PI * (*pr) * (*pr));
    printf(YELLOW "Circumference = %.2f\n" RESET, 2 * PI * (*pr));
}

int main() {
    int choice;

    do {
        printf(BLUE "\n📐 MINI GEOMETRY TOOLKIT 📐\n" RESET);
        printf("1. Triangle 🔺\n");
        printf("2. Square ⬜\n");
        printf("3. Rectangle ▭\n");
        printf("4. Circle ⚪\n");
        printf("5. Exit\n");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1: triangle(); break;
            case 2: square(); break;
            case 3: rectangle(); break;
            case 4: circle(); break;
            case 5: printf(RED "Exiting...\n" RESET); break;
            default: printf(RED "Invalid choice!\n" RESET);
        }

    } while(choice != 5);

    return 0;
}


