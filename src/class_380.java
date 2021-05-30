import java.util.Comparator;

// $FF: renamed from: nj
public class class_380 implements Comparator {

   // $FF: renamed from: f int
   static int field_4201;
   // $FF: renamed from: v boolean
   final boolean field_4202;


   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_6668(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_6669(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_6675((class_338)var1, (class_338)var2, (byte)-9);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "nj.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "nj.equals(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_6670(Object var1, Object var2) {
      return this.method_6675((class_338)var1, (class_338)var2, (byte)-92);
   }

   // $FF: renamed from: n (lx, lx) int
   int method_6671(class_338 var1, class_338 var2) {
      return this.field_4202?var1.method_5999(1750928708).method_6275(var2.method_5999(1311553808), 1184937971):var2.method_5999(597560356).method_6275(var1.method_5999(1823183661), -554276327);
   }

   // $FF: renamed from: <init> (boolean) void
   public class_380(boolean var1) {
      super();
      try {
         this.field_4202 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "nj.<init>(" + ')');
      }
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_6673(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_6674(Object var1, Object var2) {
      return this.method_6675((class_338)var1, (class_338)var2, (byte)-82);
   }

   // $FF: renamed from: v (lx, lx, byte) int
   int method_6675(class_338 var1, class_338 var2, byte var3) {
      try {
         int var10000;
         if(this.field_4202) {
            if(var3 == 1) {
               throw new IllegalStateException();
            }

            var10000 = var1.method_5999(1857071806).method_6275(var2.method_5999(1971015184), -1034402672);
         } else {
            var10000 = var2.method_5999(1430059031).method_6275(var1.method_5999(2141529201), 464325492);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "nj.v(" + ')');
      }
   }

   // $FF: renamed from: f (lx, lx) int
   int method_6676(class_338 var1, class_338 var2) {
      return this.field_4202?var1.method_5999(988996523).method_6275(var2.method_5999(1902223176), 445025675):var2.method_5999(566389662).method_6275(var1.method_5999(1344793202), -960531070);
   }
}
