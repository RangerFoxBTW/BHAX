#include <iostream>
#include <boost/filesystem.hpp>

int main()
{
    int count = 0;
    boost::filesystem::recursive_directory_iterator i("/home/dani/Dokumentumok/lol/");
    while(i != boost::filesystem::recursive_directory_iterator())
    {
        if(i->path().extension() == ".java" && is_regular_file(i->path()))
            count++;
        i++;
    }
    std::cout << count << std::endl;
}