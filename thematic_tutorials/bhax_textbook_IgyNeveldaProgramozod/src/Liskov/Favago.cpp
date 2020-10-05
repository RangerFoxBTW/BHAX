#include "std_lib_facilities.h"

struct Csomopont
{
    int adat;
    Csomopont* bal;
    Csomopont* jobb;

    Csomopont()             //gyoker
    {
  <para>
            <programlisting language="c++"><![CDATA[
#include "std_lib_facilities.h"

struct Csomopont
{
    int adat;
    Csomopont* bal;
    Csomopont* jobb;

    Csomopont()             //gyoker
    {
        adat = 9;
        jobb = NULL;
        bal = NULL;
    }

    Csomopont(int input)    //levelek
    {
        adat = input;
        jobb = NULL;
        bal = NULL;
    }
};

void bekerInput(vector<int>& vektor, Csomopont* gyoker)
{
    int input;
    Csomopont* jelenlegi = gyoker;
    while (cin >> input)
    {
        vektor.push_back(input);
        if (input == 0)
        {
            if (jelenlegi->bal != NULL)
                jelenlegi = jelenlegi->bal;
            else
            {
                Csomopont* uj = new Csomopont(input);
                jelenlegi->bal = uj;
                jelenlegi = gyoker;
            }
        }
        else
        {
            if (jelenlegi->jobb != NULL)
                jelenlegi = jelenlegi->jobb;
            else
            {
                Csomopont* uj = new Csomopont(input);
                jelenlegi->jobb = uj;
                jelenlegi = gyoker;
            }
        }
    }
}

void kiirInput(vector<int>& vektor)
{
    int enter = 0;
    cout << "Input adatok: " << endl;
    for (const auto& item : vektor)
    {
        cout << item;
        enter++;
        if (enter == 60)
        {
            cout << endl;
            enter = 0;
        }
    }
}

void kiirFa(Csomopont* gyoker)
{
    if (gyoker == NULL)
        return;
    cout << gyoker->adat << ' ';
    kiirFa(gyoker->bal);
    kiirFa(gyoker->jobb);
}

int agak(Csomopont* elem, Csomopont* gyoker)
{
    if (elem == NULL)
        return 0;
    if (elem->jobb == NULL && elem->bal == NULL)
    {
        if (elem != gyoker)
            return 1;
        else
            return 0;
    }
     vektor.push_back(hossz);
    agakHossza(elem->jobb, gyoker, hossz + 1, vektor);
    agakHossza(elem->bal, gyoker, hossz + 1, vektor);
}

int main()
{
    Csomopont* gyoker = new Csomopont();
    int szum1 = 0;
    double szum2 = 0;
    vector<int> vektor;
    vector<int> hossz;

    bekerInput(vektor, gyoker);
    kiirInput(vektor);
    cout << endl << "A fa elemei:" << endl;
    kiirFa(gyoker);
    int agakSzama = agak(gyoker, gyoker);
    cout << endl << "Az agak szama: " << agakSzama << endl;
    agakHossza(gyoker, gyoker, 0, hossz);

    for (const auto item : hossz)
    {
        szum1 += item;
    }
    double atlag = (double)szum1 / agakSzama;
    cout << "A fa againak atlagos hossza: " << atlag << endl;

    for (const auto item : hossz)
    {
        szum2 += ((item - atlag) * (item - atlag));
    }
    cout << "Az agak hosszanak tapasztalati szorasa: " << sqrt(szum2 / agakSzama) << endl;
}]]></programlisting>
        </para> int bal = agak(elem->bal, gyoker);
    int jobb = agak(elem->jobb, gyoker);

    return bal + jobb;
}

void agakHossza(Csomopont* elem, Csomopont* gyoker, int hossz, vector<int>& vektor)
{
    if (elem == NULL) {
        return;
    }
    if (elem->jobb == NULL && elem->bal == NULL)
        if (elem != gyoker)
            vektor.push_back(hossz);
    agakHossza(elem->jobb, gyoker, hossz + 1, vektor);
    agakHossza(elem->bal, gyoker, hossz + 1, vektor);
}

int main()
{
    Csomopont* gyoker = new Csomopont();
    int szum1 = 0;
    double szum2 = 0;
    vector<int> vektor;
    vector<int> hossz;

    bekerInput(vektor, gyoker);
    kiirInput(vektor);
    cout << endl << "A fa elemei:" << endl;
    kiirFa(gyoker);
    int agakSzama = agak(gyoker, gyoker);
    cout << endl << "Az agak szama: " << agakSzama << endl;
    agakHossza(gyoker, gyoker, 0, hossz);

    for (const auto item : hossz)
    {
        szum1 += item;
    }
    double atlag = (double)szum1 / agakSzama;
    cout << "A fa againak atlagos hossza: " << atlag << endl;

    for (const auto item : hossz)
    {
        szum2 += ((item - atlag) * (item - atlag));
    }
    cout << "Az agak hosszanak tapasztalati szorasa: " << sqrt(szum2 / agakSzama) << endl;
}]]></programlisting>
        </para>      adat = 9;
        jobb = NULL;
        bal = NULL;
    }

    Csomopont(int input)    //levelek
    {
        adat = input;
        jobb = NULL;
        bal = NULL;
    }
};

void bekerInput(vector<int>& vektor, Csomopont* gyoker)
{
    int input;
    Csomopont* jelenlegi = gyoker;
    while (cin >> input)
    {
        vektor.push_back(input);
        if (input == 0)
        {
            if (jelenlegi->bal != NULL)
                jelenlegi = jelenlegi->bal;
            else
            {
                Csomopont* uj = new Csomopont(input);
                jelenlegi->bal = uj;
                jelenlegi = gyoker;
            }
        }
        else
        {
            if (jelenlegi->jobb != NULL)
                jelenlegi = jelenlegi->jobb;
            else
            {
                Csomopont* uj = new Csomopont(input);
                jelenlegi->jobb = uj;
                jelenlegi = gyoker;
            }
        }
    }
}

void kiirInput(vector<int>& vektor)
{
    int enter = 0;
    cout << "Input adatok: " << endl;
    for (const auto& item : vektor)
    {
        cout << item;
        enter++;
        if (enter == 60)
        {
            cout << endl;
            enter = 0;
        }
    }
}

void kiirFa(Csomopont* gyoker)
{
    if (gyoker == NULL)
        return;
    cout << gyoker->adat << ' ';
    kiirFa(gyoker->bal);
    kiirFa(gyoker->jobb);
}

int agak(Csomopont* elem, Csomopont* gyoker)
{
    if (elem == NULL)
        return 0;
    if (elem->jobb == NULL && elem->bal == NULL)
    {
        if (elem != gyoker)
            return 1;
        else
            return 0;
    }
    int bal = agak(elem->bal, gyoker);
    int jobb = agak(elem->jobb, gyoker);

    return bal + jobb;
}

void agakHossza(Csomopont* elem, Csomopont* gyoker, int hossz, vector<int>& vektor)
{
    if (elem == NULL) {
        return;
    }
    if (elem->jobb == NULL && elem->bal == NULL)
        if (elem != gyoker)
            vektor.push_back(hossz);
    agakHossza(elem->jobb, gyoker, hossz + 1, vektor);
    agakHossza(elem->bal, gyoker, hossz + 1, vektor);
}

int main()
{
    Csomopont* gyoker = new Csomopont();
    int szum1 = 0;
    double szum2 = 0;
    vector<int> vektor;
    vector<int> hossz;

    bekerInput(vektor, gyoker);
    kiirInput(vektor);
    cout << endl << "A fa elemei:" << endl;
    kiirFa(gyoker);
    int agakSzama = agak(gyoker, gyoker);
    cout << endl << "Az agak szama: " << agakSzama << endl;
    agakHossza(gyoker, gyoker, 0, hossz);

    for (const auto item : hossz)
    {
        szum1 += item;
    }
    double atlag = (double)szum1 / agakSzama;
    cout << "A fa againak atlagos hossza: " << atlag << endl;

    for (const auto item : hossz)
    {
        szum2 += ((item - atlag) * (item - atlag));
    }
    cout << "Az agak hosszanak tapasztalati szorasa: " << sqrt(szum2 / agakSzama) << endl;
}