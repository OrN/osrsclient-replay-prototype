
// $FF: renamed from: hw
public final class class_269 {

   // $FF: renamed from: b long
   public long field_3169;
   // $FF: renamed from: v int
   int field_3170;
   // $FF: renamed from: l int
   public static final int field_3171 = 14;
   // $FF: renamed from: y int
   int field_3172;
   // $FF: renamed from: p int
   int field_3173;
   // $FF: renamed from: n int
   int field_3174;
   // $FF: renamed from: r gl
   public class_91 field_3175;
   // $FF: renamed from: f int
   int field_3176;
   // $FF: renamed from: d int
   int field_3177;
   // $FF: renamed from: j gl
   public class_91 field_3178;


   // $FF: renamed from: lo (io, int) java.lang.String
   static String method_5039(class_37 var0, int var1) {
      try {
         if(class_196.method_3989(class_112.method_2236(var0, 2134269821)) == 0) {
            if(var1 <= -1105343720) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if(var0.field_110 != null) {
               if(var1 <= -1105343720) {
                  throw new IllegalStateException();
               }

               if(var0.field_110.trim().length() != 0) {
                  return var0.field_110;
               }

               if(var1 <= -1105343720) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_269() {
      super();
      try {
         this.field_3169 = 0L;
         this.field_3177 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: io (java.lang.String, java.lang.String, int, int, int, int, boolean, int) void
   static final void method_5041(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         if(client.field_1553) {
            if(var7 != -2076246411) {
               throw new IllegalStateException();
            }
         } else {
            if(client.field_1554 * 673512273 < 500) {
               if(var7 != -2076246411) {
                  throw new IllegalStateException();
               }

               client.field_1631[client.field_1554 * 673512273] = var0;
               client.field_1560[client.field_1554 * 673512273] = var1;
               client.field_1557[673512273 * client.field_1554] = var2;
               client.field_1558[client.field_1554 * 673512273] = var3;
               client.field_1555[673512273 * client.field_1554] = var4;
               client.field_1610[673512273 * client.field_1554] = var5;
               client.field_1492[client.field_1554 * 673512273] = var6;
               client.field_1554 += -135189071;
            }

         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}
