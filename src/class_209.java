
// $FF: renamed from: eb
public class class_209 {

   // $FF: renamed from: n int
   public static final int field_2420 = 2;
   // $FF: renamed from: v jv
   public static class_306 field_2421;
   // $FF: renamed from: g int
   public static final int field_2422 = 20;


   // $FF: renamed from: r (mr, int, int) int
   static int method_4151(class_369 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_32 var3 = (class_32)var0.method_6586((long)var1);
         return var3 == null?var2:var3.field_58;
      }
   }

   // $FF: renamed from: y (nd, mr) mr
   static final class_369 method_4152(Buffer var0, class_369 var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if(var1 == null) {
         var3 = class_100.method_1845(var2);
         class_369 var10000 = new class_369(var3);
         var1 = var10000;
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.method_134();
         Object var6;
         if(var4) {
            class_34 var7 = new class_34(var0.method_139(-391631059));
            var6 = var7;
         } else {
            class_32 var8 = new class_32(var0.method_135());
            var6 = var8;
         }

         var1.method_6588((class_27)var6, (long)var5);
      }

      return var1;
   }

   // $FF: renamed from: p (nd, mr) mr
   static final class_369 method_4153(Buffer var0, class_369 var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if(var1 == null) {
         var3 = class_100.method_1845(var2);
         class_369 var10000 = new class_369(var3);
         var1 = var10000;
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.method_134();
         Object var6;
         if(var4) {
            class_34 var7 = new class_34(var0.method_139(-391631059));
            var6 = var7;
         } else {
            class_32 var8 = new class_32(var0.method_135());
            var6 = var8;
         }

         var1.method_6588((class_27)var6, (long)var5);
      }

      return var1;
   }

   // $FF: renamed from: l (mr, int, java.lang.String) java.lang.String
   static String method_4154(class_369 var0, int var1, String var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_34 var3 = (class_34)var0.method_6586((long)var1);
         return var3 == null?var2:(String)var3.field_60;
      }
   }

   // $FF: renamed from: o (mr, int, java.lang.String) java.lang.String
   static String method_4155(class_369 var0, int var1, String var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_34 var3 = (class_34)var0.method_6586((long)var1);
         return var3 == null?var2:(String)var3.field_60;
      }
   }

   // $FF: renamed from: b (mr, int, int) int
   static int method_4156(class_369 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_32 var3 = (class_32)var0.method_6586((long)var1);
         return var3 == null?var2:var3.field_58;
      }
   }

   // $FF: renamed from: d (mr, int, int) int
   static int method_4157(class_369 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_32 var3 = (class_32)var0.method_6586((long)var1);
         return var3 == null?var2:var3.field_58;
      }
   }

   // $FF: renamed from: s (mr, int, java.lang.String) java.lang.String
   static String method_4158(class_369 var0, int var1, String var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_34 var3 = (class_34)var0.method_6586((long)var1);
         return var3 == null?var2:(String)var3.field_60;
      }
   }

   // $FF: renamed from: u (mr, int, java.lang.String) java.lang.String
   static String method_4159(class_369 var0, int var1, String var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_34 var3 = (class_34)var0.method_6586((long)var1);
         return var3 == null?var2:(String)var3.field_60;
      }
   }

   // $FF: renamed from: <init> () void
   class_209() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: j (mr, int, int) int
   static int method_4161(class_369 var0, int var1, int var2) {
      if(var0 == null) {
         return var2;
      } else {
         class_32 var3 = (class_32)var0.method_6586((long)var1);
         return var3 == null?var2:var3.field_58;
      }
   }

   // $FF: renamed from: u (byte) oh[]
   static class_67[] method_4162(byte var0) {
      try {
         class_67[] var1 = new class_67[-522791973 * class_403.field_4277];

         for(int var2 = 0; var2 < class_403.field_4277 * -522791973; ++var2) {
            if(var0 <= 0) {
               throw new IllegalStateException();
            }

            class_67 var10002 = new class_67();
            class_67 var3 = var1[var2] = var10002;
            var3.field_501 = class_403.field_4276 * -1099363635;
            var3.field_505 = class_380.field_4201 * -821679425;
            var3.field_504 = class_223.field_2529[var2];
            var3.field_503 = class_284.field_3260[var2];
            var3.field_508 = class_403.field_4278[var2];
            var3.field_500 = class_318.field_3787[var2];
            int var4 = var3.field_508 * var3.field_500;
            byte[] var5 = class_403.field_4279[var2];
            var3.field_502 = new int[var4];

            for(int var6 = 0; var6 < var4; ++var6) {
               if(var0 <= 0) {
                  throw new IllegalStateException();
               }

               var3.field_502[var6] = class_192.field_2300[var5[var6] & 255];
            }
         }

         class_192.method_3958();
         return var1;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
