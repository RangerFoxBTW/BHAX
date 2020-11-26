#include <iostream>
#include <string>


class Szulo
{
	public:
        void message()
        {
            std::cout << "Uzenet" << std::endl;
        }
};

class Gyerek : public Szulo
{
	public:
        void message2()
        {
            std::cout << "Gyerek uzenet" << std::endl;
        }
};


int main()
{
	Szulo* szulo = new Szulo();
	Szulo* gyerek = new Gyerek();

    szulo->message();   //Lefut
	gyerek->message2(); //Nem fut le
	delete szulo;
	delete gyerek;

}