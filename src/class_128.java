import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// $FF: renamed from: ag
public class class_128 implements class_0 {

   // $FF: renamed from: v java.security.MessageDigest
   final MessageDigest field_1696;


    // $FF: renamed from: <init> (aj) void
   class_128(class_130 var1) {
      super();
      this.field_1696 = this.method_2848();
   }

   // $FF: renamed from: v (int, java.lang.String, long) boolean
   boolean method_2834(int var1, String var2, long var3) {
      byte[] var5 = this.method_2837(var2, var3);
      return method_2835(var5) >= var1;
   }

   // $FF: renamed from: n (byte[]) int
   static int method_2835(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         byte var4 = var2[var3];
         int var5 = method_2836(var4);
         var1 += var5;
         if(var5 != 8) {
            break;
         }
      }

      return var1;
   }

   // $FF: renamed from: f (byte) int
   static int method_2836(byte var0) {
      int var1 = 0;
      if(var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: y (java.lang.String, long) byte[]
   byte[] method_2837(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field_1696.reset();

      try {
         this.field_1696.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field_1696.digest();
   }

   // $FF: renamed from: o (java.lang.String, long) byte[]
   byte[] method_2846(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field_1696.reset();

      try {
         this.field_1696.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field_1696.digest();
   }

   // $FF: renamed from: c (java.lang.String, long) byte[]
   byte[] method_2847(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field_1696.reset();

      try {
         this.field_1696.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field_1696.digest();
   }

   // $FF: renamed from: p () java.security.MessageDigest
   MessageDigest method_2848() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

}
