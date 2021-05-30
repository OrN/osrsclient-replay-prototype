
// $FF: renamed from: ku
public final class class_332 {

   // $FF: renamed from: n long[]
   static long[] field_3861;
   // $FF: renamed from: v char[]
   public static final char[] field_3862;


   // $FF: renamed from: <init> () void
   class_332() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ku.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3862 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
      field_3861 = new long[12];

      for(int var0 = 0; var0 < field_3861.length; ++var0) {
         field_3861[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   // $FF: renamed from: f (long) java.lang.String
   public static String method_5887(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = field_3862[(int)(var6 - 37L * var0)];
               if(1819775977 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: y (long) java.lang.String
   public static String method_5888(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = field_3862[(int)(var6 - 37L * var0)];
               if(-26439265 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: p (long) java.lang.String
   public static String method_5889(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = field_3862[(int)(var6 - 37L * var0)];
               if(95 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: kv (int, int, byte) void
   static final void method_5890(int var0, int var1, byte var2) {
      try {
         if(client.field_1647[var0] != null) {
            if(var1 >= 0) {
               if(var2 <= 2) {
                  throw new IllegalStateException();
               }

               if(var1 < client.field_1647[var0].method_501((byte)17)) {
                  class_178 var3 = (class_178)client.field_1647[var0].field_318.get(var1);
                  if(var3.field_2221 != -1) {
                     return;
                  }

                  class_203 var4 = client.field_1463;
                  class_40 var5 = class_112.method_2238(class_266.field_3086, var4.field_2384, (byte)8);
                  var5.field_263.method_210(3 + class_166.method_3598(var3.field_2222, 24519255), 303066737);
                  var5.field_263.method_210(var0, 303066737);
                  var5.field_263.method_333(var1, 1583115657);
                  var5.field_263.method_120(var3.field_2222, -427478981);
                  var4.method_4079(var5, -1660823226);
                  return;
               }

               if(var2 <= 2) {
                  return;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ku.kv(" + ')');
      }
   }

   // $FF: renamed from: r (java.lang.CharSequence) java.lang.String
   public static String method_5891(CharSequence var0) {
      long var3 = 0L;
      int var5 = var0.length();

      for(int var6 = 0; var6 < var5; ++var6) {
         var3 *= 37L;
         char var7 = var0.charAt(var6);
         if(var7 >= 65 && var7 <= 90) {
            var3 += (long)(1 + var7 - 65);
         } else if(var7 >= 97 && var7 <= 122) {
            var3 += (long)(1 + var7 - 97);
         } else if(var7 >= 48 && var7 <= 57) {
            var3 += (long)(var7 + 27 - 48);
         }

         if(var3 >= 177917621779460413L) {
            break;
         }
      }

      while(var3 % 37L == 0L && var3 != 0L) {
         var3 /= 37L;
      }

      String var8 = class_291.method_5296(var3);
      if(var8 == null) {
         var8 = "";
      }

      return var8;
   }

   // $FF: renamed from: j (java.lang.CharSequence) java.lang.String
   public static String method_5892(CharSequence var0) {
      long var3 = 0L;
      int var5 = var0.length();

      for(int var6 = 0; var6 < var5; ++var6) {
         var3 *= 37L;
         char var7 = var0.charAt(var6);
         if(var7 >= 65 && var7 <= 90) {
            var3 += (long)(1 + var7 - 65);
         } else if(var7 >= 97 && var7 <= 122) {
            var3 += (long)(1 + var7 - 97);
         } else if(var7 >= 48 && var7 <= 57) {
            var3 += (long)(var7 + 27 - 48);
         }

         if(var3 >= 177917621779460413L) {
            break;
         }
      }

      while(var3 % 37L == 0L && var3 != 0L) {
         var3 /= 37L;
      }

      String var8 = class_291.method_5296(var3);
      if(var8 == null) {
         var8 = "";
      }

      return var8;
   }
}
