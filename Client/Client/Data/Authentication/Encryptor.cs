using System;
using System.Security.Cryptography;
using System.Text;

namespace Client.Data.Authentication
{
    public class Encryptor
    {


        public  string Encrypt(string password)
        {
            SHA256 hashSvc = SHA256.Create();

            byte[] hash = hashSvc.ComputeHash(Encoding.UTF8.GetBytes(password));

            string message = BitConverter.ToString(hash).Replace("-", "");
            return message;
        }
    }
}