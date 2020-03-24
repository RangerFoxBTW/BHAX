#define MAX 1000000
#define BUFFER_SIZE 512
#define KEY_SIZE 8
#define _GNU_SOURCE
#include <stdio.h>
#include <unistd.h>
#include <string.h>
double
averageWordLength (const char *secret, int secretSize)
{
int spaces = 0;
for (int i = 0; i < secretSize; ++i)
if (secret[i] == ’ ’)
++spaces;
return (double) secretSize / spaces;
}
int
isItClean (const char *secret, int secretSize)
{
double wordLength = averageWordLength (secret, secretSize);
return wordLength > 6.0 && wordLength < 9.0
&& strcasestr (secret, "hogy") && strcasestr (secret, "nem")
&& strcasestr (secret, "az") && strcasestr (secret, "ha");
}
void
exor (const char key[], int keySize, char secret[], int secretSize)
{
int keyIndex = 0;
for (int i = 0; i < secretSize; ++i)
{
secret[i] = secret[i] ^ key[keyIndex];
keyIndex = (keyIndex + 1) % keySize;
}
}
int
applyExor (const char key[], int keySize, char secret[],
int secretSize)
{
exor (key, keySize, secret, secretSize);
return isItClean (secret, secretSize);
}
int
main (void)
{
char key[KEY_SIZE];
char secret[MAX];
char *p = secret;
int readBytes;
// secret fajt berantasa
while ((readBytes =
read (0, (void *) p,
(p - secret + BUFFER_SIZE <
MAX) ? BUFFER_SIZE : secret + MAX - p)))
p += readBytes;
for (int i = 0; i < MAX - (p - secret); ++i)
secret[p - secret + i] = ’\0’;
for (int ii = ’0’; ii <= ’9’; ++ii)
for (int ji = ’0’; ji <= ’9’; ++ji)
for (int ki = ’0’; ki <= ’9’; ++ki)
for (int li = ’0’; li <= ’9’; ++li)
for (int mi = ’0’; mi <= ’9’; ++mi)
for (int ni = ’0’; ni <= ’9’; ++ni)
for (int oi = ’0’; oi <= ’9’; ++oi)
for (int pi = ’0’; pi <= ’9’; ++pi)
{
key[0] = ii;
key[1] = ji;
key[2] = ki;
key[3] = li;
key[4] = mi;
key[5] = ni;
key[6] = oi;
key[7] = pi;
if (applyExor (key, KEY_SIZE, secret, p - secret))
printf
("Kulcs: [%c%c%c%c%c%c%c%c]\nTiszta szoveg: [%s]\n",
ii, ji, ki, li, mi, ni, oi, pi, secret);
// ujra EXOR-ozunk, igy nem kell egy masodik buffer
exor (key, KEY_SIZE, secret, p - secret);
}
return 0;
}