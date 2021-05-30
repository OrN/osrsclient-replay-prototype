import java.util.Date;

// $FF: renamed from: lq
public class class_355 extends class_354 {

   // $FF: renamed from: n ly
   public class_359 field_3965;
   // $FF: renamed from: f short
   public short field_3966;
   // $FF: renamed from: v int
   public int field_3967;


   // $FF: renamed from: lb (java.lang.String, int) void
   static void method_6240(String var0, int var1) {
      try {
         class_371.field_4107 = var0;

         try {
            String var2 = class_121.field_1337.getParameter(Integer.toString(18));
            String var3 = class_121.field_1337.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            if(var0.length() == 0) {
               if(var1 == -1465159787) {
                  throw new IllegalStateException();
               }

               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               String var5 = var4 + "; Expires=";
               long var7 = class_87.method_1516((byte)1) + 94608000000L;
               class_284.field_3258.setTime(new Date(var7));
               int var9 = class_284.field_3258.get(7);
               int var10 = class_284.field_3258.get(5);
               int var11 = class_284.field_3258.get(2);
               int var12 = class_284.field_3258.get(1);
               int var13 = class_284.field_3258.get(11);
               int var14 = class_284.field_3258.get(12);
               int var15 = class_284.field_3258.get(13);
               String var6 = class_284.field_3257[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class_284.field_3259[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
               var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            class_129.method_2852(class_121.field_1337, "document.cookie=\"" + var4 + "\"", -2125796670);
         } catch (Throwable var16) {
            ;
         }

      } catch (RuntimeException var17) {
         throw class_223.method_4281(var17, "lq.lb(" + ')');
      }
   }

   // $FF: renamed from: <init> (ly, int) void
   class_355(class_359 var1, int var2) {
      super();
      try {
         this.field_3967 = (int)(class_87.method_1516((byte)1) / 1000L) * 686676213;
         this.field_3965 = var1;
         this.field_3966 = (short)var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "lq.<init>(" + ')');
      }
   }
}
