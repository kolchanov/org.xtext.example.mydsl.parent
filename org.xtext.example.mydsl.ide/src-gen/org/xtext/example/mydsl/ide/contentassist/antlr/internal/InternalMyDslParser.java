package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'import'", "'section'", "'entity'", "'RecommendedValues'", "'for'", "'['", "']'", "'Selected'", "'value'", "'in'", "'->'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // InternalMyDsl.g:78:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFQN EOF )
            // InternalMyDsl.g:80:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMyDsl.g:87:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__FQN__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__FQN__Group__0 )
            // InternalMyDsl.g:94:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleImport"
    // InternalMyDsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleImport EOF )
            // InternalMyDsl.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyDsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Import__Group__0 )
            // InternalMyDsl.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSection"
    // InternalMyDsl.g:128:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSection EOF )
            // InternalMyDsl.g:130:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalMyDsl.g:137:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Section__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Section__Group__0 )
            // InternalMyDsl.g:144:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEntity EOF )
            // InternalMyDsl.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDictionary"
    // InternalMyDsl.g:178:1: entryRuleDictionary : ruleDictionary EOF ;
    public final void entryRuleDictionary() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDictionary EOF )
            // InternalMyDsl.g:180:1: ruleDictionary EOF
            {
             before(grammarAccess.getDictionaryRule()); 
            pushFollow(FOLLOW_1);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getDictionaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // InternalMyDsl.g:187:1: ruleDictionary : ( ( rule__Dictionary__Group__0 ) ) ;
    public final void ruleDictionary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Dictionary__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Dictionary__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Dictionary__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Dictionary__Group__0 )
            {
             before(grammarAccess.getDictionaryAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Dictionary__Group__0 )
            // InternalMyDsl.g:194:4: rule__Dictionary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleRecommendedValueItem"
    // InternalMyDsl.g:203:1: entryRuleRecommendedValueItem : ruleRecommendedValueItem EOF ;
    public final void entryRuleRecommendedValueItem() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRecommendedValueItem EOF )
            // InternalMyDsl.g:205:1: ruleRecommendedValueItem EOF
            {
             before(grammarAccess.getRecommendedValueItemRule()); 
            pushFollow(FOLLOW_1);
            ruleRecommendedValueItem();

            state._fsp--;

             after(grammarAccess.getRecommendedValueItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecommendedValueItem"


    // $ANTLR start "ruleRecommendedValueItem"
    // InternalMyDsl.g:212:1: ruleRecommendedValueItem : ( ( rule__RecommendedValueItem__NameAssignment ) ) ;
    public final void ruleRecommendedValueItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__RecommendedValueItem__NameAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__RecommendedValueItem__NameAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__RecommendedValueItem__NameAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__RecommendedValueItem__NameAssignment )
            {
             before(grammarAccess.getRecommendedValueItemAccess().getNameAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__RecommendedValueItem__NameAssignment )
            // InternalMyDsl.g:219:4: rule__RecommendedValueItem__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RecommendedValueItem__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRecommendedValueItemAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecommendedValueItem"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRule EOF )
            // InternalMyDsl.g:230:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:244:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:253:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleValue EOF )
            // InternalMyDsl.g:255:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:262:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Value__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Value__Group__0 )
            // InternalMyDsl.g:269:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rule__Section__ItemsAlternatives_2_0"
    // InternalMyDsl.g:277:1: rule__Section__ItemsAlternatives_2_0 : ( ( ruleEntity ) | ( ruleDictionary ) | ( ruleRule ) );
    public final void rule__Section__ItemsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ruleEntity ) | ( ruleDictionary ) | ( ruleRule ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:282:2: ( ruleEntity )
                    // InternalMyDsl.g:283:3: ruleEntity
                    {
                     before(grammarAccess.getSectionAccess().getItemsEntityParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getItemsEntityParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ruleDictionary )
                    {
                    // InternalMyDsl.g:288:2: ( ruleDictionary )
                    // InternalMyDsl.g:289:3: ruleDictionary
                    {
                     before(grammarAccess.getSectionAccess().getItemsDictionaryParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDictionary();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getItemsDictionaryParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ruleRule )
                    {
                    // InternalMyDsl.g:294:2: ( ruleRule )
                    // InternalMyDsl.g:295:3: ruleRule
                    {
                     before(grammarAccess.getSectionAccess().getItemsRuleParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getItemsRuleParserRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ItemsAlternatives_2_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:304:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:309:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:316:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( ( rule__Model__ImportsAssignment_0 )? ) )
            // InternalMyDsl.g:321:1: ( ( rule__Model__ImportsAssignment_0 )? )
            {
            // InternalMyDsl.g:321:1: ( ( rule__Model__ImportsAssignment_0 )? )
            // InternalMyDsl.g:322:2: ( rule__Model__ImportsAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalMyDsl.g:323:2: ( rule__Model__ImportsAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:323:3: rule__Model__ImportsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ImportsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:331:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:336:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:342:1: rule__Model__Group__1__Impl : ( ( rule__Model__SectionAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:346:1: ( ( ( rule__Model__SectionAssignment_1 ) ) )
            // InternalMyDsl.g:347:1: ( ( rule__Model__SectionAssignment_1 ) )
            {
            // InternalMyDsl.g:347:1: ( ( rule__Model__SectionAssignment_1 ) )
            // InternalMyDsl.g:348:2: ( rule__Model__SectionAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getSectionAssignment_1()); 
            // InternalMyDsl.g:349:2: ( rule__Model__SectionAssignment_1 )
            // InternalMyDsl.g:349:3: rule__Model__SectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__SectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalMyDsl.g:358:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMyDsl.g:363:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalMyDsl.g:370:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:375:1: ( RULE_ID )
            {
            // InternalMyDsl.g:375:1: ( RULE_ID )
            // InternalMyDsl.g:376:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalMyDsl.g:385:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__FQN__Group__1__Impl )
            // InternalMyDsl.g:390:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalMyDsl.g:396:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMyDsl.g:401:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMyDsl.g:401:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMyDsl.g:402:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMyDsl.g:403:2: ( rule__FQN__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:403:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalMyDsl.g:412:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMyDsl.g:417:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalMyDsl.g:424:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( '.' ) )
            // InternalMyDsl.g:429:1: ( '.' )
            {
            // InternalMyDsl.g:429:1: ( '.' )
            // InternalMyDsl.g:430:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalMyDsl.g:439:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMyDsl.g:444:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalMyDsl.g:450:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:455:1: ( RULE_ID )
            {
            // InternalMyDsl.g:455:1: ( RULE_ID )
            // InternalMyDsl.g:456:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyDsl.g:466:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyDsl.g:471:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMyDsl.g:478:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( 'import' ) )
            // InternalMyDsl.g:483:1: ( 'import' )
            {
            // InternalMyDsl.g:483:1: ( 'import' )
            // InternalMyDsl.g:484:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMyDsl.g:493:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__Import__Group__1__Impl )
            // InternalMyDsl.g:498:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMyDsl.g:504:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalMyDsl.g:509:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalMyDsl.g:509:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalMyDsl.g:510:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalMyDsl.g:511:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalMyDsl.g:511:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalMyDsl.g:520:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalMyDsl.g:525:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalMyDsl.g:532:1: rule__Section__Group__0__Impl : ( 'section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( ( 'section' ) )
            // InternalMyDsl.g:537:1: ( 'section' )
            {
            // InternalMyDsl.g:537:1: ( 'section' )
            // InternalMyDsl.g:538:2: 'section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalMyDsl.g:547:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalMyDsl.g:552:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalMyDsl.g:559:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalMyDsl.g:564:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:564:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalMyDsl.g:565:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:566:2: ( rule__Section__NameAssignment_1 )
            // InternalMyDsl.g:566:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalMyDsl.g:574:1: rule__Section__Group__2 : rule__Section__Group__2__Impl ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__Section__Group__2__Impl )
            // InternalMyDsl.g:579:2: rule__Section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalMyDsl.g:585:1: rule__Section__Group__2__Impl : ( ( rule__Section__ItemsAssignment_2 )* ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ( rule__Section__ItemsAssignment_2 )* ) )
            // InternalMyDsl.g:590:1: ( ( rule__Section__ItemsAssignment_2 )* )
            {
            // InternalMyDsl.g:590:1: ( ( rule__Section__ItemsAssignment_2 )* )
            // InternalMyDsl.g:591:2: ( rule__Section__ItemsAssignment_2 )*
            {
             before(grammarAccess.getSectionAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:592:2: ( rule__Section__ItemsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:592:3: rule__Section__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Section__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:601:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:606:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:613:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( ( 'entity' ) )
            // InternalMyDsl.g:618:1: ( 'entity' )
            {
            // InternalMyDsl.g:618:1: ( 'entity' )
            // InternalMyDsl.g:619:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:628:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__Entity__Group__1__Impl )
            // InternalMyDsl.g:633:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:639:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:644:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:644:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:645:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:646:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:646:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Dictionary__Group__0"
    // InternalMyDsl.g:655:1: rule__Dictionary__Group__0 : rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 ;
    public final void rule__Dictionary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 )
            // InternalMyDsl.g:660:2: rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Dictionary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__0"


    // $ANTLR start "rule__Dictionary__Group__0__Impl"
    // InternalMyDsl.g:667:1: rule__Dictionary__Group__0__Impl : ( 'RecommendedValues' ) ;
    public final void rule__Dictionary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( 'RecommendedValues' ) )
            // InternalMyDsl.g:672:1: ( 'RecommendedValues' )
            {
            // InternalMyDsl.g:672:1: ( 'RecommendedValues' )
            // InternalMyDsl.g:673:2: 'RecommendedValues'
            {
             before(grammarAccess.getDictionaryAccess().getRecommendedValuesKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDictionaryAccess().getRecommendedValuesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__0__Impl"


    // $ANTLR start "rule__Dictionary__Group__1"
    // InternalMyDsl.g:682:1: rule__Dictionary__Group__1 : rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2 ;
    public final void rule__Dictionary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2 )
            // InternalMyDsl.g:687:2: rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Dictionary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__1"


    // $ANTLR start "rule__Dictionary__Group__1__Impl"
    // InternalMyDsl.g:694:1: rule__Dictionary__Group__1__Impl : ( 'for' ) ;
    public final void rule__Dictionary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( 'for' ) )
            // InternalMyDsl.g:699:1: ( 'for' )
            {
            // InternalMyDsl.g:699:1: ( 'for' )
            // InternalMyDsl.g:700:2: 'for'
            {
             before(grammarAccess.getDictionaryAccess().getForKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDictionaryAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__1__Impl"


    // $ANTLR start "rule__Dictionary__Group__2"
    // InternalMyDsl.g:709:1: rule__Dictionary__Group__2 : rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3 ;
    public final void rule__Dictionary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3 )
            // InternalMyDsl.g:714:2: rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Dictionary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__2"


    // $ANTLR start "rule__Dictionary__Group__2__Impl"
    // InternalMyDsl.g:721:1: rule__Dictionary__Group__2__Impl : ( ( rule__Dictionary__EntityAssignment_2 ) ) ;
    public final void rule__Dictionary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( ( rule__Dictionary__EntityAssignment_2 ) ) )
            // InternalMyDsl.g:726:1: ( ( rule__Dictionary__EntityAssignment_2 ) )
            {
            // InternalMyDsl.g:726:1: ( ( rule__Dictionary__EntityAssignment_2 ) )
            // InternalMyDsl.g:727:2: ( rule__Dictionary__EntityAssignment_2 )
            {
             before(grammarAccess.getDictionaryAccess().getEntityAssignment_2()); 
            // InternalMyDsl.g:728:2: ( rule__Dictionary__EntityAssignment_2 )
            // InternalMyDsl.g:728:3: rule__Dictionary__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__2__Impl"


    // $ANTLR start "rule__Dictionary__Group__3"
    // InternalMyDsl.g:736:1: rule__Dictionary__Group__3 : rule__Dictionary__Group__3__Impl rule__Dictionary__Group__4 ;
    public final void rule__Dictionary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__Dictionary__Group__3__Impl rule__Dictionary__Group__4 )
            // InternalMyDsl.g:741:2: rule__Dictionary__Group__3__Impl rule__Dictionary__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Dictionary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__3"


    // $ANTLR start "rule__Dictionary__Group__3__Impl"
    // InternalMyDsl.g:748:1: rule__Dictionary__Group__3__Impl : ( '[' ) ;
    public final void rule__Dictionary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( '[' ) )
            // InternalMyDsl.g:753:1: ( '[' )
            {
            // InternalMyDsl.g:753:1: ( '[' )
            // InternalMyDsl.g:754:2: '['
            {
             before(grammarAccess.getDictionaryAccess().getLeftSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDictionaryAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__3__Impl"


    // $ANTLR start "rule__Dictionary__Group__4"
    // InternalMyDsl.g:763:1: rule__Dictionary__Group__4 : rule__Dictionary__Group__4__Impl rule__Dictionary__Group__5 ;
    public final void rule__Dictionary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__Dictionary__Group__4__Impl rule__Dictionary__Group__5 )
            // InternalMyDsl.g:768:2: rule__Dictionary__Group__4__Impl rule__Dictionary__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Dictionary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__4"


    // $ANTLR start "rule__Dictionary__Group__4__Impl"
    // InternalMyDsl.g:775:1: rule__Dictionary__Group__4__Impl : ( ( ( rule__Dictionary__ValuesAssignment_4 ) ) ( ( rule__Dictionary__ValuesAssignment_4 )* ) ) ;
    public final void rule__Dictionary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( ( rule__Dictionary__ValuesAssignment_4 ) ) ( ( rule__Dictionary__ValuesAssignment_4 )* ) ) )
            // InternalMyDsl.g:780:1: ( ( ( rule__Dictionary__ValuesAssignment_4 ) ) ( ( rule__Dictionary__ValuesAssignment_4 )* ) )
            {
            // InternalMyDsl.g:780:1: ( ( ( rule__Dictionary__ValuesAssignment_4 ) ) ( ( rule__Dictionary__ValuesAssignment_4 )* ) )
            // InternalMyDsl.g:781:2: ( ( rule__Dictionary__ValuesAssignment_4 ) ) ( ( rule__Dictionary__ValuesAssignment_4 )* )
            {
            // InternalMyDsl.g:781:2: ( ( rule__Dictionary__ValuesAssignment_4 ) )
            // InternalMyDsl.g:782:3: ( rule__Dictionary__ValuesAssignment_4 )
            {
             before(grammarAccess.getDictionaryAccess().getValuesAssignment_4()); 
            // InternalMyDsl.g:783:3: ( rule__Dictionary__ValuesAssignment_4 )
            // InternalMyDsl.g:783:4: rule__Dictionary__ValuesAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Dictionary__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getValuesAssignment_4()); 

            }

            // InternalMyDsl.g:786:2: ( ( rule__Dictionary__ValuesAssignment_4 )* )
            // InternalMyDsl.g:787:3: ( rule__Dictionary__ValuesAssignment_4 )*
            {
             before(grammarAccess.getDictionaryAccess().getValuesAssignment_4()); 
            // InternalMyDsl.g:788:3: ( rule__Dictionary__ValuesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:788:4: rule__Dictionary__ValuesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Dictionary__ValuesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDictionaryAccess().getValuesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__4__Impl"


    // $ANTLR start "rule__Dictionary__Group__5"
    // InternalMyDsl.g:797:1: rule__Dictionary__Group__5 : rule__Dictionary__Group__5__Impl ;
    public final void rule__Dictionary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Dictionary__Group__5__Impl )
            // InternalMyDsl.g:802:2: rule__Dictionary__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dictionary__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__5"


    // $ANTLR start "rule__Dictionary__Group__5__Impl"
    // InternalMyDsl.g:808:1: rule__Dictionary__Group__5__Impl : ( ']' ) ;
    public final void rule__Dictionary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ']' ) )
            // InternalMyDsl.g:813:1: ( ']' )
            {
            // InternalMyDsl.g:813:1: ( ']' )
            // InternalMyDsl.g:814:2: ']'
            {
             before(grammarAccess.getDictionaryAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDictionaryAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:824:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:829:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:836:1: rule__Rule__Group__0__Impl : ( 'Selected' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( 'Selected' ) )
            // InternalMyDsl.g:841:1: ( 'Selected' )
            {
            // InternalMyDsl.g:841:1: ( 'Selected' )
            // InternalMyDsl.g:842:2: 'Selected'
            {
             before(grammarAccess.getRuleAccess().getSelectedKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSelectedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:851:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:856:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:863:1: rule__Rule__Group__1__Impl : ( 'value' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( 'value' ) )
            // InternalMyDsl.g:868:1: ( 'value' )
            {
            // InternalMyDsl.g:868:1: ( 'value' )
            // InternalMyDsl.g:869:2: 'value'
            {
             before(grammarAccess.getRuleAccess().getValueKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:878:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMyDsl.g:883:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:890:1: rule__Rule__Group__2__Impl : ( 'for' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( 'for' ) )
            // InternalMyDsl.g:895:1: ( 'for' )
            {
            // InternalMyDsl.g:895:1: ( 'for' )
            // InternalMyDsl.g:896:2: 'for'
            {
             before(grammarAccess.getRuleAccess().getForKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMyDsl.g:905:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMyDsl.g:910:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMyDsl.g:917:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EntityAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( ( ( rule__Rule__EntityAssignment_3 ) ) )
            // InternalMyDsl.g:922:1: ( ( rule__Rule__EntityAssignment_3 ) )
            {
            // InternalMyDsl.g:922:1: ( ( rule__Rule__EntityAssignment_3 ) )
            // InternalMyDsl.g:923:2: ( rule__Rule__EntityAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntityAssignment_3()); 
            // InternalMyDsl.g:924:2: ( rule__Rule__EntityAssignment_3 )
            // InternalMyDsl.g:924:3: rule__Rule__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalMyDsl.g:932:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMyDsl.g:937:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalMyDsl.g:944:1: rule__Rule__Group__4__Impl : ( 'in' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( 'in' ) )
            // InternalMyDsl.g:949:1: ( 'in' )
            {
            // InternalMyDsl.g:949:1: ( 'in' )
            // InternalMyDsl.g:950:2: 'in'
            {
             before(grammarAccess.getRuleAccess().getInKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalMyDsl.g:959:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMyDsl.g:964:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalMyDsl.g:971:1: rule__Rule__Group__5__Impl : ( '[' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( '[' ) )
            // InternalMyDsl.g:976:1: ( '[' )
            {
            // InternalMyDsl.g:976:1: ( '[' )
            // InternalMyDsl.g:977:2: '['
            {
             before(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalMyDsl.g:986:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMyDsl.g:991:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalMyDsl.g:998:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ValuesAssignment_6 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ( rule__Rule__ValuesAssignment_6 )? ) )
            // InternalMyDsl.g:1003:1: ( ( rule__Rule__ValuesAssignment_6 )? )
            {
            // InternalMyDsl.g:1003:1: ( ( rule__Rule__ValuesAssignment_6 )? )
            // InternalMyDsl.g:1004:2: ( rule__Rule__ValuesAssignment_6 )?
            {
             before(grammarAccess.getRuleAccess().getValuesAssignment_6()); 
            // InternalMyDsl.g:1005:2: ( rule__Rule__ValuesAssignment_6 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1005:3: rule__Rule__ValuesAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ValuesAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getValuesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalMyDsl.g:1013:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__Rule__Group__7__Impl )
            // InternalMyDsl.g:1018:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalMyDsl.g:1024:1: rule__Rule__Group__7__Impl : ( ']' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ']' ) )
            // InternalMyDsl.g:1029:1: ( ']' )
            {
            // InternalMyDsl.g:1029:1: ( ']' )
            // InternalMyDsl.g:1030:2: ']'
            {
             before(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalMyDsl.g:1040:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalMyDsl.g:1045:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalMyDsl.g:1052:1: rule__Value__Group__0__Impl : ( ( rule__Value__Value1Assignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( rule__Value__Value1Assignment_0 ) ) )
            // InternalMyDsl.g:1057:1: ( ( rule__Value__Value1Assignment_0 ) )
            {
            // InternalMyDsl.g:1057:1: ( ( rule__Value__Value1Assignment_0 ) )
            // InternalMyDsl.g:1058:2: ( rule__Value__Value1Assignment_0 )
            {
             before(grammarAccess.getValueAccess().getValue1Assignment_0()); 
            // InternalMyDsl.g:1059:2: ( rule__Value__Value1Assignment_0 )
            // InternalMyDsl.g:1059:3: rule__Value__Value1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Value1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValue1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalMyDsl.g:1067:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalMyDsl.g:1072:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalMyDsl.g:1079:1: rule__Value__Group__1__Impl : ( '->' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( '->' ) )
            // InternalMyDsl.g:1084:1: ( '->' )
            {
            // InternalMyDsl.g:1084:1: ( '->' )
            // InternalMyDsl.g:1085:2: '->'
            {
             before(grammarAccess.getValueAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // InternalMyDsl.g:1094:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Value__Group__2__Impl )
            // InternalMyDsl.g:1099:2: rule__Value__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalMyDsl.g:1105:1: rule__Value__Group__2__Impl : ( ( rule__Value__Value2Assignment_2 ) ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( ( rule__Value__Value2Assignment_2 ) ) )
            // InternalMyDsl.g:1110:1: ( ( rule__Value__Value2Assignment_2 ) )
            {
            // InternalMyDsl.g:1110:1: ( ( rule__Value__Value2Assignment_2 ) )
            // InternalMyDsl.g:1111:2: ( rule__Value__Value2Assignment_2 )
            {
             before(grammarAccess.getValueAccess().getValue2Assignment_2()); 
            // InternalMyDsl.g:1112:2: ( rule__Value__Value2Assignment_2 )
            // InternalMyDsl.g:1112:3: rule__Value__Value2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value__Value2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValue2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalMyDsl.g:1121:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ruleImport ) )
            // InternalMyDsl.g:1126:2: ( ruleImport )
            {
            // InternalMyDsl.g:1126:2: ( ruleImport )
            // InternalMyDsl.g:1127:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__SectionAssignment_1"
    // InternalMyDsl.g:1136:1: rule__Model__SectionAssignment_1 : ( ruleSection ) ;
    public final void rule__Model__SectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( ( ruleSection ) )
            // InternalMyDsl.g:1141:2: ( ruleSection )
            {
            // InternalMyDsl.g:1141:2: ( ruleSection )
            // InternalMyDsl.g:1142:3: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSectionSectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SectionAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalMyDsl.g:1151:1: rule__Import__ImportURIAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( ( RULE_STRING ) ) )
            // InternalMyDsl.g:1156:2: ( ( RULE_STRING ) )
            {
            // InternalMyDsl.g:1156:2: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1157:3: ( RULE_STRING )
            {
             before(grammarAccess.getImportAccess().getImportURISectionCrossReference_1_0()); 
            // InternalMyDsl.g:1158:3: ( RULE_STRING )
            // InternalMyDsl.g:1159:4: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISectionSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISectionSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getImportURISectionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalMyDsl.g:1170:1: rule__Section__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1175:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1175:2: ( RULE_STRING )
            // InternalMyDsl.g:1176:3: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__ItemsAssignment_2"
    // InternalMyDsl.g:1185:1: rule__Section__ItemsAssignment_2 : ( ( rule__Section__ItemsAlternatives_2_0 ) ) ;
    public final void rule__Section__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ( rule__Section__ItemsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:1190:2: ( ( rule__Section__ItemsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:1190:2: ( ( rule__Section__ItemsAlternatives_2_0 ) )
            // InternalMyDsl.g:1191:3: ( rule__Section__ItemsAlternatives_2_0 )
            {
             before(grammarAccess.getSectionAccess().getItemsAlternatives_2_0()); 
            // InternalMyDsl.g:1192:3: ( rule__Section__ItemsAlternatives_2_0 )
            // InternalMyDsl.g:1192:4: rule__Section__ItemsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Section__ItemsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getItemsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ItemsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:1200:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1205:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1205:2: ( RULE_ID )
            // InternalMyDsl.g:1206:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Dictionary__EntityAssignment_2"
    // InternalMyDsl.g:1215:1: rule__Dictionary__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Dictionary__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( ruleFQN ) ) )
            // InternalMyDsl.g:1220:2: ( ( ruleFQN ) )
            {
            // InternalMyDsl.g:1220:2: ( ( ruleFQN ) )
            // InternalMyDsl.g:1221:3: ( ruleFQN )
            {
             before(grammarAccess.getDictionaryAccess().getEntityEntityCrossReference_2_0()); 
            // InternalMyDsl.g:1222:3: ( ruleFQN )
            // InternalMyDsl.g:1223:4: ruleFQN
            {
             before(grammarAccess.getDictionaryAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDictionaryAccess().getEntityEntityFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDictionaryAccess().getEntityEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__EntityAssignment_2"


    // $ANTLR start "rule__Dictionary__ValuesAssignment_4"
    // InternalMyDsl.g:1234:1: rule__Dictionary__ValuesAssignment_4 : ( ruleRecommendedValueItem ) ;
    public final void rule__Dictionary__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ruleRecommendedValueItem ) )
            // InternalMyDsl.g:1239:2: ( ruleRecommendedValueItem )
            {
            // InternalMyDsl.g:1239:2: ( ruleRecommendedValueItem )
            // InternalMyDsl.g:1240:3: ruleRecommendedValueItem
            {
             before(grammarAccess.getDictionaryAccess().getValuesRecommendedValueItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRecommendedValueItem();

            state._fsp--;

             after(grammarAccess.getDictionaryAccess().getValuesRecommendedValueItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__ValuesAssignment_4"


    // $ANTLR start "rule__RecommendedValueItem__NameAssignment"
    // InternalMyDsl.g:1249:1: rule__RecommendedValueItem__NameAssignment : ( RULE_STRING ) ;
    public final void rule__RecommendedValueItem__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1254:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1254:2: ( RULE_STRING )
            // InternalMyDsl.g:1255:3: RULE_STRING
            {
             before(grammarAccess.getRecommendedValueItemAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecommendedValueItemAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecommendedValueItem__NameAssignment"


    // $ANTLR start "rule__Rule__EntityAssignment_3"
    // InternalMyDsl.g:1264:1: rule__Rule__EntityAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Rule__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ( ruleFQN ) ) )
            // InternalMyDsl.g:1269:2: ( ( ruleFQN ) )
            {
            // InternalMyDsl.g:1269:2: ( ( ruleFQN ) )
            // InternalMyDsl.g:1270:3: ( ruleFQN )
            {
             before(grammarAccess.getRuleAccess().getEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:1271:3: ( ruleFQN )
            // InternalMyDsl.g:1272:4: ruleFQN
            {
             before(grammarAccess.getRuleAccess().getEntityEntityFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEntityEntityFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EntityAssignment_3"


    // $ANTLR start "rule__Rule__ValuesAssignment_6"
    // InternalMyDsl.g:1283:1: rule__Rule__ValuesAssignment_6 : ( ruleValue ) ;
    public final void rule__Rule__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1288:2: ( ruleValue )
            {
            // InternalMyDsl.g:1288:2: ( ruleValue )
            // InternalMyDsl.g:1289:3: ruleValue
            {
             before(grammarAccess.getRuleAccess().getValuesValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getValuesValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ValuesAssignment_6"


    // $ANTLR start "rule__Value__Value1Assignment_0"
    // InternalMyDsl.g:1298:1: rule__Value__Value1Assignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Value__Value1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( ( ruleFQN ) ) )
            // InternalMyDsl.g:1303:2: ( ( ruleFQN ) )
            {
            // InternalMyDsl.g:1303:2: ( ( ruleFQN ) )
            // InternalMyDsl.g:1304:3: ( ruleFQN )
            {
             before(grammarAccess.getValueAccess().getValue1RecommendedValueItemCrossReference_0_0()); 
            // InternalMyDsl.g:1305:3: ( ruleFQN )
            // InternalMyDsl.g:1306:4: ruleFQN
            {
             before(grammarAccess.getValueAccess().getValue1RecommendedValueItemFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValue1RecommendedValueItemFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getValueAccess().getValue1RecommendedValueItemCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Value1Assignment_0"


    // $ANTLR start "rule__Value__Value2Assignment_2"
    // InternalMyDsl.g:1317:1: rule__Value__Value2Assignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Value__Value2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( ( ( ruleFQN ) ) )
            // InternalMyDsl.g:1322:2: ( ( ruleFQN ) )
            {
            // InternalMyDsl.g:1322:2: ( ( ruleFQN ) )
            // InternalMyDsl.g:1323:3: ( ruleFQN )
            {
             before(grammarAccess.getValueAccess().getValue2RecommendedValueItemCrossReference_2_0()); 
            // InternalMyDsl.g:1324:3: ( ruleFQN )
            // InternalMyDsl.g:1325:4: ruleFQN
            {
             before(grammarAccess.getValueAccess().getValue2RecommendedValueItemFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValue2RecommendedValueItemFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getValueAccess().getValue2RecommendedValueItemCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Value2Assignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000008C002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});

}