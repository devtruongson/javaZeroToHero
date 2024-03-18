using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {

        static void Thang(int thang)
        {

            switch (thang)
            {
                case 1:
                case 3:
                case 7:
                case 9:
                case 10:
                case 12:
                    Console.WriteLine("Tháng có 31 ngày");
                    break;
                case 2:
                    {
                        Console.WriteLine("Nhap nam:");
                        int year = int.Parse(Console.ReadLine());
                        bool isNhuan = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                        if (isNhuan)
                        {
                            Console.WriteLine("Nam " + year + " co 29 ngay.");
                        }
                        else
                        {
                            Console.WriteLine("Nam " + year + " co 28 ngay.");
                        }
                        break;
                    }
                default:
                    Console.WriteLine("Tháng có 30 ngày");
                    break;
            }
        }

        static void Mua(int thang)
        {
            string season = "";
            switch (thang)
            {
                case 3:
                case 4:
                case 5:
                    season = "Xuân";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Hè";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Thu";
                    break;
                case 12:
                case 1:
                case 2:
                    season = "Đông";
                    break;
                default:
                    Console.WriteLine("Tháng không hợp lệ.");
                    return;
            }

            Console.WriteLine("Tháng " + thang + " là mùa " + season + ".");
        }

        static void Feature()
        {
            Console.WriteLine("Nhap thang :");
            int thang = int.Parse(Console.ReadLine());
            if (thang > 12 || thang <= 0)
            {
                Console.WriteLine("Sai input");
                return;
            }

            Thang(thang);
            Mua(thang);
        }

        static void ArrayInput()
        {
            Console.WriteLine("Nhap so phan tu cua mang:");
            int length = int.Parse(Console.ReadLine());
            int[] number = new int[length];
            for (int i = 0; i < length; i++)
            {
                Console.WriteLine("Nhap phan tu thu :{0}", i);
                number[i] = int.Parse(Console.ReadLine());
            }

            String soAm = "";
            String soD = "";

            for (int i = 0; i < length; i++)
            {
                if (number[i] >= 0)
                {
                    soD += number[i] + ",";
                }
                else
                {
                    soAm += number[i] + ",";
                }
            }

            Console.WriteLine("Day so am " + soAm);
            Console.WriteLine("Day so duong " + soD);
        }

        static void ArrayInputDelete()
        {
            Console.WriteLine("Nhap so phan tu cua mang:");
            int length = int.Parse(Console.ReadLine());
            int[] number = new int[length];
            for (int i = 0; i < length; i++)
            {
                Console.WriteLine("Nhap phan tu thu :{0}", i);
                number[i] = int.Parse(Console.ReadLine());
            }
            Console.WriteLine("Nhap gia tri can xoa:");
            int itemDelete = int.Parse(Console.ReadLine());
            bool isFind = false;
            for (int i = 0; i < length; i++)
            {
                if (number[i] == itemDelete)
                {
                    isFind = true;
                    for (int j = i; j < length - 1; j++)
                    {
                        number[j] = number[j + 1];
                    }
                    length -= 1;
                    i--;
                }
            }
            if (!isFind)
            {
                Console.WriteLine("Khong tim thay phan tu de xoa");
            }
            Console.WriteLine("Mang sau khi xoa:");
            for (int i = 0; i < length; i++)
            {
                Console.WriteLine(number[i]);
            }
        }

        static void Main(string[] args)
        {
            /*do
            {
                Feature();
                Console.Write("Continue? (y/N): ");
                string conti = Console.ReadLine();
                if (conti != "y")
                {
                    break;
                }
            } while (true);*/
            //  ArrayInput();
            ArrayInputDelete();
        }
    }
}
