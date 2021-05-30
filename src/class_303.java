import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// $FF: renamed from: jm
public class class_303 {

   // $FF: renamed from: f java.util.Comparator
   public static Comparator field_3388;
   // $FF: renamed from: n java.util.Comparator
   public static Comparator field_3389;
   // $FF: renamed from: g int
   static final int field_3390 = 17;
   // $FF: renamed from: y java.util.Comparator
   public static Comparator field_3391;
   // $FF: renamed from: v java.util.List
   public final List field_3392;
   // $FF: renamed from: p java.util.Comparator
   public static Comparator field_3393;
   // $FF: renamed from: ad int
   static final int field_3394 = 7;
   // $FF: renamed from: jp io
   static class_37 field_3395;


   // $FF: renamed from: y (java.util.Comparator, boolean) void
   public void method_5362(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field_3392, var1);
      } else {
         Collections.sort(this.field_3392, Collections.reverseOrder(var1));
      }

   }

   // $FF: renamed from: f (java.util.Comparator, boolean) void
   public void method_5363(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field_3392, var1);
      } else {
         Collections.sort(this.field_3392, Collections.reverseOrder(var1));
      }

   }

   // $FF: renamed from: <init> (nd, boolean) void
   public void method_5364(class_28 var1, boolean var2) {
      try {
         super();
         int var3 = var1.method_132((byte)-50);
         boolean var4 = var1.method_130(1337840952) == 1;
         byte var5;
         if(var4) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         int var6 = var1.method_132((byte)-1);
         this.field_3392 = new ArrayList(var6);

         for(int var7 = 0; var7 < var6; ++var7) {
            List var10000 = this.field_3392;
            class_310 var10001 = new class_310;
            var10001.method_5542(var1, var5, var3);
            var10000.add(var10001);
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "jm.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (java.util.Comparator, boolean) void
   public void method_5365(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field_3392, var1);
      } else {
         Collections.sort(this.field_3392, Collections.reverseOrder(var1));
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5366() {
      class_311 var10000 = new class_311;
      var10000.method_5548();
      field_3389 = var10000;
      (new class_300).method_5351();
      class_315 var0 = new class_315;
      var0.method_5605();
      field_3388 = var0;
      class_294 var1 = new class_294;
      var1.method_5305();
      field_3391 = var1;
      class_309 var2 = new class_309;
      var2.method_5528();
      field_3393 = var2;
   }

   // $FF: renamed from: p (java.util.Comparator, boolean) void
   public void method_5367(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.field_3392, var1);
      } else {
         Collections.sort(this.field_3392, Collections.reverseOrder(var1));
      }

   }

   // $FF: renamed from: v (java.util.Comparator, boolean, int) void
   public void method_5368(Comparator var1, boolean var2, int var3) {
      try {
         if(var2) {
            if(var3 >= -1753389289) {
               throw new IllegalStateException();
            }

            Collections.sort(this.field_3392, var1);
         } else {
            Collections.sort(this.field_3392, Collections.reverseOrder(var1));
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "jm.v(" + ')');
      }
   }

   // $FF: renamed from: hy (int, int, int, int) void
   static final void method_5369(int var0, int var1, int var2, int var3) {
      try {
         if(var0 >= 128) {
            if(var3 != -1158444411) {
               throw new IllegalStateException();
            }

            if(var1 >= 128) {
               if(var3 != -1158444411) {
                  throw new IllegalStateException();
               }

               if(var0 <= 13056) {
                  if(var3 != -1158444411) {
                     throw new IllegalStateException();
                  }

                  if(var1 <= 13056) {
                     int var4 = class_205.method_4113(var0, var1, 1115122599 * class_115.field_1289, 589860392) - var2;
                     var0 -= class_131.field_1719 * 1681670171;
                     var4 -= class_172.field_2159 * 45831589;
                     var1 -= class_205.field_2393 * -2115685501;
                     int var5 = class_70.field_548[-1584922015 * class_78.field_686];
                     int var6 = class_70.field_559[-1584922015 * class_78.field_686];
                     int var7 = class_70.field_548[class_382.field_4208 * 611240317];
                     int var8 = class_70.field_559[class_382.field_4208 * 611240317];
                     int var9 = var7 * var1 + var0 * var8 >> 16;
                     var1 = var8 * var1 - var7 * var0 >> 16;
                     var0 = var9;
                     var9 = var6 * var4 - var5 * var1 >> 16;
                     var1 = var5 * var4 + var1 * var6 >> 16;
                     if(var1 >= 50) {
                        if(var3 != -1158444411) {
                           throw new IllegalStateException();
                        }

                        client.field_1434 = (client.field_1682 * 755828989 * var0 / var1 + -592780465 * client.field_1680 / 2) * 164672425;
                        client.field_1517 = (var9 * client.field_1682 * 755828989 / var1 + client.field_1681 * 1806233111 / 2) * -522689307;
                     } else {
                        client.field_1434 = -164672425;
                        client.field_1517 = 522689307;
                     }

                     return;
                  }

                  if(var3 != -1158444411) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         client.field_1434 = -164672425;
         client.field_1517 = 522689307;
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "jm.hy(" + ')');
      }
   }
}
