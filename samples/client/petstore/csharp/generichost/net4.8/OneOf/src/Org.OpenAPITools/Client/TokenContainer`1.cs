// <auto-generated>

using System.Linq;
using System.Collections.Generic;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// A container for a collection of tokens.
    /// </summary>
    /// <typeparam name="TTokenBase"></typeparam>
    public sealed class TokenContainer<TTokenBase> where TTokenBase : TokenBase
    {
        /// <summary>
        /// The collection of tokens
        /// </summary>
        public List<TTokenBase> Tokens { get; } = new List<TTokenBase>();

        /// <summary>
        /// Instantiates a TokenContainer
        /// </summary>
        public TokenContainer()
        {
        }

        /// <summary>
        /// Instantiates a TokenContainer
        /// </summary>
        /// <param name="tokens"></param>
        public TokenContainer(System.Collections.Generic.IEnumerable<TTokenBase> tokens)
        {
            Tokens = tokens.ToList();
        }
    }
}