
// $FF: renamed from: bi
public class class_101 extends class_59 {

   // $FF: renamed from: j lu
   class_357 field_1173;
   // $FF: renamed from: n int
   int field_1174;
   // $FF: renamed from: f int
   int field_1175;
   // $FF: renamed from: b java.lang.String
   String field_1176;
   // $FF: renamed from: r lu
   class_357 field_1179;
   // $FF: renamed from: y java.lang.String
   String field_1180;
   // $FF: renamed from: d java.lang.String
   String field_1181;
   // $FF: renamed from: s bq
   static class_154 field_1182;
   // $FF: renamed from: v int
   int field_1183;
   // $FF: renamed from: p ly
   class_359 field_1184;


   // $FF: renamed from: v (int, java.lang.String, java.lang.String, java.lang.String, int) void
   void method_1883(int var1, String var2, String var3, String var4, int var5) {
      try {
         int var6 = (class_197.field_2337 += 300746265) * 543094313 - 1;
         this.field_1183 = var6 * -1719880919;
         this.field_1174 = client.field_1425 * 612436449;
         this.field_1175 = var1 * 626007683;
         this.field_1180 = var2;
         this.method_1884(1824375293);
         this.field_1176 = var3;
         this.field_1181 = var4;
         this.method_1907(1400910895);
         this.method_1890(1063727257);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "bi.v(" + ')');
      }
   }

   // $FF: renamed from: b (int) void
   final void method_1884(int var1) {
      try {
         if(null != this.field_1180) {
            class_359 var10001 = new class_359(class_122.method_2271(this.field_1180, (byte)16), class_239.field_2659);
            this.field_1184 = var10001;
         } else {
            this.field_1184 = null;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.b(" + ')');
      }
   }

   // $FF: renamed from: <init> (int, java.lang.String, java.lang.String, java.lang.String) void
   class_101(int var1, String var2, String var3, String var4) {
      super();
      try {
         this.field_1173 = class_357.field_3980;
         this.field_1179 = class_357.field_3980;
         this.method_1883(var1, var2, var3, var4, 2082804570);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "bi.<init>(" + ')');
      }
   }

   // $FF: renamed from: j (int) boolean
   final boolean method_1888(int var1) {
      try {
         if(this.field_1179 == class_357.field_3980) {
            this.method_1889((byte)-2);
         }

         boolean var10000;
         if(class_357.field_3979 == this.field_1179) {
            if(var1 == -1087727229) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.j(" + ')');
      }
   }

   // $FF: renamed from: r (byte) void
   void method_1889(byte var1) {
      try {
         this.field_1179 = class_208.field_2413.field_1995.method_6063(this.field_1184, -234571238)?class_357.field_3979:class_357.field_3978;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.r(" + ')');
      }
   }

   // $FF: renamed from: p (int) void
   void method_1890(int var1) {
      try {
         this.field_1179 = class_357.field_3980;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.p(" + ')');
      }
   }

   // $FF: renamed from: y (byte) void
   void method_1897(byte var1) {
      try {
         this.field_1173 = class_208.field_2413.field_1994.method_6063(this.field_1184, -234571238)?class_357.field_3979:class_357.field_3978;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.y(" + ')');
      }
   }

   // $FF: renamed from: f (int) boolean
   final boolean method_1901(int var1) {
      try {
         if(class_357.field_3980 == this.field_1173) {
            if(var1 <= 903308794) {
               throw new IllegalStateException();
            }

            this.method_1897((byte)118);
         }

         boolean var10000;
         if(this.field_1173 == class_357.field_3979) {
            if(var1 <= 903308794) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.f(" + ')');
      }
   }

   // $FF: renamed from: n (int) void
   void method_1907(int var1) {
      try {
         this.field_1173 = class_357.field_3980;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bi.n(" + ')');
      }
   }

}
