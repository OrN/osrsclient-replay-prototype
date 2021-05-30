import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

// $FF: renamed from: ci
public class class_168 {

   // $FF: renamed from: n java.math.BigInteger
   static final BigInteger field_2099;
   // $FF: renamed from: v java.math.BigInteger
   static final BigInteger field_2100;
   // $FF: renamed from: f int
   static final int field_2101 = 66;
   // $FF: renamed from: nb int
   static int field_2102;
   // $FF: renamed from: ge byte[][]
   static byte[][] field_2103;


   // $FF: renamed from: y (java.lang.CharSequence, int) int
   public static int method_3609(CharSequence var0) {
      try {
         return class_176.method_3747(var0, 10, true, (byte)-105);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2100 = new BigInteger("10001", 16);
      field_2099 = new BigInteger("88d2b28e43dc7be8f2376826a6d810274f07f489daf46f3fc0a40ad847e6c852b10e6939d9252721d4fb8501cf1348cdabec4165b62bd8aa0dbe6ed0394524dfe2cdce9287df5cbedb0d33bc1d9df71cb2e5c67a5d05fa058b182a192ad83fa80b8ff245b45500dce1f746b9a14db36d711c889f35183243d5805cd875580975", 16);
   }

   // $FF: renamed from: v (byte[], int) fd
   static class_217 method_3611(byte[] var0, int var1) {
      try {
         class_217 var10000;
         if(null == var0) {
            if(var1 <= 280539552) {
               throw new IllegalStateException();
            } else {
               var10000 = new class_217();
               return var10000;
            }
         } else {
            var10000 = new class_217(class_86.method_1480(var0).field_502);
            return var10000;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_168() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (java.lang.String, java.lang.String, boolean, int) nm
   public static class_383 method_3613(String var0, String var1, boolean var2, int var3) {
      try {
         File var4 = new File(class_53.field_397, "preferences" + var0 + ".dat");
         class_383 var10000;
         if(var4.exists()) {
            if(var3 <= 1676173537) {
               throw new IllegalStateException();
            }

            try {
               var10000 = new class_383(var4, "rw", 10000L);
               class_383 var12 = var10000;
               return var12;
            } catch (IOException var10) {
               ;
            }
         }

         String var5 = "";
         if(33 == class_184.field_2257 * -1166420103) {
            if(var3 <= 1676173537) {
               throw new IllegalStateException();
            }

            var5 = "_rc";
         } else if(34 == -1166420103 * class_184.field_2257) {
            if(var3 <= 1676173537) {
               throw new IllegalStateException();
            }

            var5 = "_wip";
         }

         File var6 = new File(class_115.homeDirectory, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         class_383 var7;
         if(!var2) {
            if(var3 <= 1676173537) {
               throw new IllegalStateException();
            }

            if(var6.exists()) {
               try {
                  var10000 = new class_383(var6, "rw", 10000L);
                  var7 = var10000;
                  return var7;
               } catch (IOException var9) {
                  ;
               }
            }
         }

         try {
            var10000 = new class_383(var4, "rw", 10000L);
            var7 = var10000;
            return var7;
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }
}
