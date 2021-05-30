import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

// $FF: renamed from: cl
public class class_170 {

   // $FF: renamed from: u int
   int field_2115;
   // $FF: renamed from: n int
   static final int field_2116 = 10;
   // $FF: renamed from: f boolean
   boolean field_2117;
   // $FF: renamed from: y boolean
   boolean field_2118;
   // $FF: renamed from: p int
   int field_2119;
   // $FF: renamed from: j java.lang.String
   String field_2120;
   // $FF: renamed from: s int
   int field_2121;
   // $FF: renamed from: d int
   int field_2122;
   // $FF: renamed from: r boolean
   boolean field_2123;
   // $FF: renamed from: v int
   static int field_2124;
   // $FF: renamed from: eg java.security.SecureRandom
   static SecureRandom field_2125;
   // $FF: renamed from: l java.util.LinkedHashMap
   LinkedHashMap field_2126;
   // $FF: renamed from: qd int
   static final int field_2127 = 2;
   // $FF: renamed from: b double
   double field_2128;


   // $FF: renamed from: n (int) nd
   class_28 method_3620(int var1) {
      try {
         class_28 var10000 = new class_28(100);
         class_28 var2 = var10000;
         var2.method_210(-437407307 * field_2124, 303066737);
         var2.method_210(this.field_2117?1:0, 303066737);
         var2.method_210(this.field_2118?1:0, 303066737);
         var2.method_210(this.field_2119 * -660685365, 303066737);
         var2.method_210(this.field_2126.size(), 303066737);
         Iterator var3 = this.field_2126.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var2.method_116(((Integer)var4.getKey()).intValue(), 464441913);
            var2.method_116(((Integer)var4.getValue()).intValue(), -233948534);
         }

         String var10001;
         if(this.field_2120 != null) {
            if(var1 <= -1538307343) {
               throw new IllegalStateException();
            }

            var10001 = this.field_2120;
         } else {
            var10001 = "";
         }

         var2.method_120(var10001, -427478981);
         var2.method_250(this.field_2123, (short)-16479);
         var2.method_210((int)(100.0D * this.field_2128), 303066737);
         var2.method_210(this.field_2122 * 1285356667, 303066737);
         var2.method_210(-140834991 * this.field_2121, 303066737);
         var2.method_210(-1768933319 * this.field_2115, 303066737);
         return var2;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "cl.n(" + ')');
      }
   }

   // $FF: renamed from: <init> (nd) void
   class_170(class_28 var1) {
      super();
      try {
         this.field_2119 = 511868899;
         this.field_2120 = null;
         this.field_2123 = false;
         this.field_2128 = 0.8D;
         this.field_2122 = -264120627;
         this.field_2121 = -1577437489;
         this.field_2115 = 1937297015;
         this.field_2126 = new LinkedHashMap();
         if(var1 != null && null != var1.field_12) {
            int var2 = var1.method_130(-553043461);
            if(var2 >= 0 && var2 <= field_2124 * -437407307) {
               if(var1.method_130(-167392406) == 1) {
                  this.field_2117 = true;
               }

               if(var2 > 1) {
                  this.field_2118 = var1.method_130(-1503948070) == 1;
               }

               if(var2 > 3) {
                  this.field_2119 = var1.method_130(-2067988026) * 511868899;
               }

               if(var2 > 2) {
                  int var3 = var1.method_130(-9817008);

                  for(int var4 = 0; var4 < var3; ++var4) {
                     int var5 = var1.method_135((byte)-62);
                     int var6 = var1.method_135((byte)-61);
                     this.field_2126.put(Integer.valueOf(var5), Integer.valueOf(var6));
                  }
               }

               if(var2 > 4) {
                  this.field_2120 = var1.method_347(-189323230);
               }

               if(var2 > 5) {
                  this.field_2123 = var1.method_119(788058203);
               }

               if(var2 > 6) {
                  this.field_2128 = (double)var1.method_130(-1858680539) / 100.0D;
                  this.field_2122 = var1.method_130(-1995547848) * -813727053;
                  this.field_2121 = var1.method_130(1799070570) * 156672433;
                  this.field_2115 = var1.method_130(-1986656948) * 1570911753;
               }
            } else {
               this.method_3624(true, 989597362);
            }
         } else {
            this.method_3624(true, 472379493);
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "cl.<init>(" + ')');
      }
   }

   // $FF: renamed from: b () nd
   class_28 method_3622() {
      class_28 var10000 = new class_28(100);
      class_28 var1 = var10000;
      var1.method_210(-437407307 * field_2124, 303066737);
      var1.method_210(this.field_2117?1:0, 303066737);
      var1.method_210(this.field_2118?1:0, 303066737);
      var1.method_210(this.field_2119 * 1694107947, 303066737);
      var1.method_210(this.field_2126.size(), 303066737);
      Iterator var2 = this.field_2126.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method_116(((Integer)var3.getKey()).intValue(), 158093677);
         var1.method_116(((Integer)var3.getValue()).intValue(), -2013510335);
      }

      var1.method_120(this.field_2120 != null?this.field_2120:"", -427478981);
      var1.method_250(this.field_2123, (short)-4710);
      var1.method_210((int)(100.0D * this.field_2128), 303066737);
      var1.method_210(this.field_2122 * 1285356667, 303066737);
      var1.method_210(1286486299 * this.field_2121, 303066737);
      var1.method_210(-1768933319 * this.field_2115, 303066737);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2124 = 213856331;
   }

   // $FF: renamed from: v (boolean, int) void
   void method_3624(boolean var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cl.v(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_170() {
      super();
      try {
         this.field_2119 = 511868899;
         this.field_2120 = null;
         this.field_2123 = false;
         this.field_2128 = 0.8D;
         this.field_2122 = -264120627;
         this.field_2121 = -1577437489;
         this.field_2115 = 1937297015;
         this.field_2126 = new LinkedHashMap();
         this.method_3624(true, 2046027023);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cl.<init>(" + ')');
      }
   }

   // $FF: renamed from: p (boolean) void
   void method_3626(boolean var1) {}

   // $FF: renamed from: s () nd
   class_28 method_3627() {
      class_28 var10000 = new class_28(100);
      class_28 var1 = var10000;
      var1.method_210(-437407307 * field_2124, 303066737);
      var1.method_210(this.field_2117?1:0, 303066737);
      var1.method_210(this.field_2118?1:0, 303066737);
      var1.method_210(this.field_2119 * -660685365, 303066737);
      var1.method_210(this.field_2126.size(), 303066737);
      Iterator var2 = this.field_2126.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method_116(((Integer)var3.getKey()).intValue(), -1506922077);
         var1.method_116(((Integer)var3.getValue()).intValue(), 477702947);
      }

      var1.method_120(this.field_2120 != null?this.field_2120:"", -427478981);
      var1.method_250(this.field_2123, (short)-21242);
      var1.method_210((int)(100.0D * this.field_2128), 303066737);
      var1.method_210(this.field_2122 * 1285356667, 303066737);
      var1.method_210(-140834991 * this.field_2121, 303066737);
      var1.method_210(-1768933319 * this.field_2115, 303066737);
      return var1;
   }

   // $FF: renamed from: r (boolean) void
   void method_3628(boolean var1) {}

   // $FF: renamed from: j (boolean) void
   void method_3629(boolean var1) {}

   // $FF: renamed from: d () nd
   class_28 method_3630() {
      class_28 var10000 = new class_28(100);
      class_28 var1 = var10000;
      var1.method_210(-437407307 * field_2124, 303066737);
      var1.method_210(this.field_2117?1:0, 303066737);
      var1.method_210(this.field_2118?1:0, 303066737);
      var1.method_210(this.field_2119 * -660685365, 303066737);
      var1.method_210(this.field_2126.size(), 303066737);
      Iterator var2 = this.field_2126.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method_116(((Integer)var3.getKey()).intValue(), 432646190);
         var1.method_116(((Integer)var3.getValue()).intValue(), -1357079764);
      }

      var1.method_120(this.field_2120 != null?this.field_2120:"", -427478981);
      var1.method_250(this.field_2123, (short)-25953);
      var1.method_210((int)(100.0D * this.field_2128), 303066737);
      var1.method_210(this.field_2122 * 1285356667, 303066737);
      var1.method_210(-140834991 * this.field_2121, 303066737);
      var1.method_210(-1768933319 * this.field_2115, 303066737);
      return var1;
   }

   // $FF: renamed from: y (boolean) void
   void method_3631(boolean var1) {}

   // $FF: renamed from: u () void
   static void method_3632() {
      class_383 var0 = null;

      try {
         var0 = class_168.method_3613("", class_154.field_1933.field_3347, true, 2000134664);
         class_28 var1 = class_87.field_852.method_3620(1430303175);
         var0.method_6686(var1.field_12, 0, var1.field_15 * -442398587, (byte)125);
      } catch (Exception var3) {
         ;
      }

      try {
         if(null != var0) {
            var0.method_6687(true, -1527050055);
         }
      } catch (Exception var2) {
         ;
      }

   }

   // $FF: renamed from: l () void
   static void method_3633() {
      class_383 var0 = null;

      try {
         var0 = class_168.method_3613("", class_154.field_1933.field_3347, true, 1687909825);
         class_28 var1 = class_87.field_852.method_3620(1130810267);
         var0.method_6686(var1.field_12, 0, var1.field_15 * -442398587, (byte)29);
      } catch (Exception var3) {
         ;
      }

      try {
         if(null != var0) {
            var0.method_6687(true, -2043916046);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
