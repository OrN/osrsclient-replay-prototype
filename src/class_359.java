
// $FF: renamed from: ly
public class class_359 implements Comparable {

   // $FF: renamed from: f int
   public static final int field_3989 = 4;
   // $FF: renamed from: n java.lang.String
   String field_3990;
   // $FF: renamed from: fa int
   static final int field_3991 = 32768;
   // $FF: renamed from: v java.lang.String
   String field_3992;
   // $FF: renamed from: w int
   static final int field_3993 = 24;


   public String acm() {
      return this.method_6272();
   }

   // $FF: renamed from: v (int) java.lang.String
   public String method_6272() {
      try {
         return this.field_3992;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (byte) boolean
   public boolean method_6273(byte var1) {
      try {
         boolean var10000;
         if(null != this.field_3990) {
            if(var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_6274(Object var1) {
      if(var1 instanceof class_359) {
         class_359 var2 = (class_359)var1;
         return this.field_3990 == null?var2.field_3990 == null:(var2.field_3990 == null?false:(this.hashCode() != var2.hashCode()?false:this.field_3990.equals(var2.field_3990)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      try {
         return null == this.field_3990?0:this.field_3990.hashCode();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   public String toString() {
      try {
         return this.method_6272();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (ly, int) int
   public int method_6275(class_359 var1, int var2) {
      try {
         if(null == this.field_3990) {
            if(var1.field_3990 == null) {
               if(var2 == -1916816431) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               return 1;
            }
         } else if(null == var1.field_3990) {
            if(var2 == -1916816431) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field_3990.compareTo(var1.field_3990);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.method_6275((class_359)var1, 831558423);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_6276(Object var1) {
      if(var1 instanceof class_359) {
         class_359 var2 = (class_359)var1;
         return this.field_3990 == null?var2.field_3990 == null:(var2.field_3990 == null?false:(this.hashCode() != var2.hashCode()?false:this.field_3990.equals(var2.field_3990)));
      } else {
         return false;
      }
   }

   // $FF: renamed from: j () java.lang.String
   public String method_6277() {
      return this.field_3992;
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_6278(Object var1) {
      if(var1 instanceof class_359) {
         class_359 var2 = (class_359)var1;
         return this.field_3990 == null?var2.field_3990 == null:(var2.field_3990 == null?false:(this.hashCode() != var2.hashCode()?false:this.field_3990.equals(var2.field_3990)));
      } else {
         return false;
      }
   }

   public int abu() {
      return null == this.field_3990?0:this.field_3990.hashCode();
   }

   public int abl() {
      return null == this.field_3990?0:this.field_3990.hashCode();
   }

   public int aco() {
      return null == this.field_3990?0:this.field_3990.hashCode();
   }

   public String acv() {
      return this.method_6272();
   }

   // $FF: renamed from: o (java.lang.Object) int
   public int method_6279(Object var1) {
      return this.method_6275((class_359)var1, -220361837);
   }

   // $FF: renamed from: <init> (java.lang.String, nc) void
   public class_359(String var1, class_375 var2) {
      super();
      try {
         this.field_3992 = var1;
         String var4;
         if(var1 == null) {
            var4 = null;
         } else {
            label146: {
               int var5 = 0;

               int var6;
               boolean var7;
               char var8;
               for(var6 = var1.length(); var5 < var6; ++var5) {
                  var8 = var1.charAt(var5);
                  var7 = var8 == 160 || var8 == 32 || var8 == 95 || 45 == var8;
                  if(!var7) {
                     break;
                  }
               }

               while(var6 > var5) {
                  var8 = var1.charAt(var6 - 1);
                  var7 = var8 == 160 || 32 == var8 || var8 == 95 || 45 == var8;
                  if(!var7) {
                     break;
                  }

                  --var6;
               }

               int var14 = var6 - var5;
               if(var14 >= 1) {
                  byte var9;
                  if(null == var2) {
                     var9 = 12;
                  } else {
                     switch(var2.field_4142 * 1440229409) {
                     case 8:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                     }
                  }

                  if(var14 <= var9) {
                     StringBuilder var15 = new StringBuilder(var14);

                     for(int var16 = var5; var16 < var6; ++var16) {
                        char var10 = var1.charAt(var16);
                        if(class_111.method_2235(var10, (byte)-24)) {
                           char var11;
                           switch(var10) {
                           case 32:
                           case 45:
                           case 95:
                           case 160:
                              var11 = 95;
                              break;
                           case 35:
                           case 91:
                           case 93:
                              var11 = var10;
                              break;
                           case 192:
                           case 193:
                           case 194:
                           case 195:
                           case 196:
                           case 224:
                           case 225:
                           case 226:
                           case 227:
                           case 228:
                              var11 = 97;
                              break;
                           case 199:
                           case 231:
                              var11 = 99;
                              break;
                           case 200:
                           case 201:
                           case 202:
                           case 203:
                           case 232:
                           case 233:
                           case 234:
                           case 235:
                              var11 = 101;
                              break;
                           case 205:
                           case 206:
                           case 207:
                           case 237:
                           case 238:
                           case 239:
                              var11 = 105;
                              break;
                           case 209:
                           case 241:
                              var11 = 110;
                              break;
                           case 210:
                           case 211:
                           case 212:
                           case 213:
                           case 214:
                           case 242:
                           case 243:
                           case 244:
                           case 245:
                           case 246:
                              var11 = 111;
                              break;
                           case 217:
                           case 218:
                           case 219:
                           case 220:
                           case 249:
                           case 250:
                           case 251:
                           case 252:
                              var11 = 117;
                              break;
                           case 223:
                              var11 = 98;
                              break;
                           case 255:
                           case 376:
                              var11 = 121;
                              break;
                           default:
                              var11 = Character.toLowerCase(var10);
                           }

                           if(var11 != 0) {
                              var15.append(var11);
                           }
                        }
                     }

                     if(var15.length() == 0) {
                        var4 = null;
                     } else {
                        var4 = var15.toString();
                     }
                     break label146;
                  }
               }

               var4 = null;
            }
         }

         this.field_3990 = var4;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   public String acx() {
      return this.method_6272();
   }

   // $FF: renamed from: s (java.lang.Object) int
   public int method_6281(Object var1) {
      return this.method_6275((class_359)var1, 528822460);
   }

   public String aci() {
      return this.method_6272();
   }

   // $FF: renamed from: u (java.lang.Object) int
   public int method_6282(Object var1) {
      return this.method_6275((class_359)var1, -942637986);
   }

   // $FF: renamed from: l (java.lang.Object) int
   public int method_6283(Object var1) {
      return this.method_6275((class_359)var1, 1108221974);
   }

   // $FF: renamed from: c () boolean
   public boolean method_6284() {
      return null != this.field_3990;
   }

   // $FF: renamed from: p () java.lang.String
   public String method_6285() {
      return this.field_3992;
   }

   // $FF: renamed from: y () java.lang.String
   public String method_6286() {
      return this.field_3992;
   }

   // $FF: renamed from: r () java.lang.String
   public String method_6287() {
      return this.field_3992;
   }

   // $FF: renamed from: b () boolean
   public boolean method_6288() {
      return null != this.field_3990;
   }

   // $FF: renamed from: d () boolean
   public boolean method_6289() {
      return null != this.field_3990;
   }

   public boolean equals(Object var1) {
      try {
         if(var1 instanceof class_359) {
            class_359 var2 = (class_359)var1;
            return this.field_3990 == null?var2.field_3990 == null:(var2.field_3990 == null?false:(this.hashCode() != var2.hashCode()?false:this.field_3990.equals(var2.field_3990)));
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: e (ly) int
   public int method_6290(class_359 var1) {
      return null == this.field_3990?(var1.field_3990 == null?0:1):(null == var1.field_3990?-1:this.field_3990.compareTo(var1.field_3990));
   }

   // $FF: renamed from: g (ly) int
   public int method_6291(class_359 var1) {
      return null == this.field_3990?(var1.field_3990 == null?0:1):(null == var1.field_3990?-1:this.field_3990.compareTo(var1.field_3990));
   }

   // $FF: renamed from: f (char, int) char
   static char method_6292(char var0, int var1) {
      try {
         if(181 != var0) {
            if(var0 != 402) {
               return Character.toTitleCase(var0);
            }

            if(var1 == -254984617) {
               throw new IllegalStateException();
            }
         }

         return var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
