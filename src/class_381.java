
// $FF: renamed from: nk
public class class_381 {

   // $FF: renamed from: n int
   public static final int field_4203 = 12;
   // $FF: renamed from: m int
   static final int field_4204 = 19;
   // $FF: renamed from: f char[]
   static final char[] field_4205;
   // $FF: renamed from: y char[]
   static final char[] field_4206;
   // $FF: renamed from: v int
   public static final int field_4207 = 1;


   // $FF: renamed from: f (char) boolean
   public static final boolean method_6677(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(class_177.method_3795(var0, 1338737271)) {
         return true;
      } else {
         char[] var1 = field_4205;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         var1 = field_4206;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_4205 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
      field_4206 = new char[]{'[', ']', '#'};
   }

   // $FF: renamed from: <init> () void
   class_381() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (char) boolean
   public static final boolean method_6680(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(class_177.method_3795(var0, 1338737271)) {
         return true;
      } else {
         char[] var1 = field_4205;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         var1 = field_4206;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: y (char) boolean
   public static final boolean method_6681(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(class_177.method_3795(var0, 1338737271)) {
         return true;
      } else {
         char[] var1 = field_4205;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         var1 = field_4206;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }
}
