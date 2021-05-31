
// $FF: renamed from: dz
public class class_205 {

   // $FF: renamed from: v java.lang.String
   static String field_2392;
   // $FF: renamed from: ha int
   static int field_2393;
   // $FF: renamed from: f java.lang.String
   static String field_2394;
   // $FF: renamed from: y java.lang.String
   static String field_2395;
   // $FF: renamed from: p java.lang.String
   static String field_2396;
   // $FF: renamed from: j java.lang.String
   static String field_2397;
   // $FF: renamed from: r java.lang.String
   static String field_2398;
   // $FF: renamed from: b java.lang.String
   static String field_2399;
   // $FF: renamed from: n java.lang.String
   static String field_2400;


   // $FF: renamed from: p (int) java.lang.String
   static String method_4109(int var0) {
      return "<img=" + var0 + ">";
   }

   // $FF: renamed from: f (int) java.lang.String
   static String method_4110(int var0) {
      return "<img=" + var0 + ">";
   }

   // $FF: renamed from: <init> () void
   class_205() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y (int) java.lang.String
   static String method_4112(int var0) {
      return "<img=" + var0 + ">";
   }

   // $FF: renamed from: hw (int, int, int, int) int
   static final int method_4113(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 >> 7;
         int var5 = var1 >> 7;
         if(var4 >= 0) {
            if(var3 == 1575148342) {
               throw new IllegalStateException();
            }

            if(var5 >= 0) {
               if(var3 == 1575148342) {
                  throw new IllegalStateException();
               }

               if(var4 <= 103) {
                  if(var3 == 1575148342) {
                     throw new IllegalStateException();
                  }

                  if(var5 <= 103) {
                     int var6 = var2;
                     if(var2 < 3 && (class_166.field_2069[1][var4][var5] & 2) == 2) {
                        if(var3 == 1575148342) {
                           throw new IllegalStateException();
                        }

                        var6 = var2 + 1;
                     }

                     int var7 = var0 & 127;
                     int var8 = var1 & 127;
                     int var9 = class_166.field_2078[var6][var4 + 1][var5] * var7 + class_166.field_2078[var6][var4][var5] * (128 - var7) >> 7;
                     int var10 = (128 - var7) * class_166.field_2078[var6][var4][1 + var5] + var7 * class_166.field_2078[var6][var4 + 1][var5 + 1] >> 7;
                     return (128 - var8) * var9 + var10 * var8 >> 7;
                  }

                  if(var3 == 1575148342) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return 0;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: j (int) java.lang.String
   static String method_4114(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2392 = "true";
      field_2400 = ",";
      field_2394 = "|";
      field_2395 = " (";
      field_2396 = ")";
      field_2397 = "->";
      field_2398 = "<br>";
      field_2399 = "</col>";
   }

   // $FF: renamed from: ku (java.lang.String, int) void
   static final void method_4116(String var0, int var1) {
      try {
         if(null == class_233.field_2617) {
            if(var1 <= 730019668) {
               throw new IllegalStateException();
            }
         } else {
            class_40 var2 = class_112.method_2238(class_266.field_3139, client.field_1463.isaac, (byte)8);
            var2.networkBuffer.writeByte(class_166.method_3598(var0));
            var2.networkBuffer.writeString(var0);
            client.field_1463.method_4079(var2);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
